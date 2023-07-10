package kr.re.kitri.spring2023.controller;

import kr.re.kitri.spring2023.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


//커피 빈과 같은 모양. 인도네시아의 자바 섬을 모티브로 했다는 말도..! 내가 볼땐 안됨 표시같은뎅
//'컴포넌트'화가 된다. ≒ Managed 객체 < 컨테이너(Spring Core. 스프링의 가장 중요한 기능)에서 관리해줌
//WAS가 올라갈때 미리 풀을 만들어줌(풀링으로 관리, 오브젝트 풀링)
//요청 들어올때마다 객체를 만들지 않고 WAS가 올라갈때 컴포넌트를 다 올려서 요청이 끝나도 다시 대기해서 또 쓸 수 있도록 해준댔음
//(자바같은 곳에서 가비지컬렉터가 찾아다니면서 삭제하는 것과는 다름)

//Controller > Service > Repository(DAO)
@RestController
public class ProductController {

    //dependancy injection이 되었다. 자동으로 엮였다.  = new ProductService() 안해줘도 됨. 선언적 프로그래밍 기법
    //field injection(Autowired 쓴거) - di 방식 중 하나(https://velog.io/@gillog/Spring-DIDependency-Injection-%EC%84%B8-%EA%B0%80%EC%A7%80-%EB%B0%A9%EB%B2%95)
//    @Autowired
    private ProductService service;

    //생성자 injection
    public ProductController(ProductService service){
        this.service = service;
    }

    @GetMapping("/products")    // /products라는 url을 get방식으로 호스팅
    //@GetMapping("http://localhost:8080/products")
    public String products() {
        // 1-4아래 기능을 수행하는게 Service
        // 1. 상품 DB에 접속한다.
        // 2. select * from products;
        // 3. 결과를 자바타입으로 변환하여..
        // 4. (JSON 형태로 바꾸어) 응답한다.

        // 컨트롤러가 View! ∴ 비즈니스 로직을 쓰지 않음.(비즈니스 로직 쓰는게 Model, Service)
        /* 분리시켜서 코딩:MVC(Model-View-Controller) 패턴 */
        //return "모든 상품을 응답합니다.";

        // new 할때마다 메모리 올라가니까 리소스 많이 잡아먹음 ∴ 퍼포먼스 안 좋음
        // ProductService service = new ProductService();
        return service.getAllProducts();
    }
}

package kr.re.kitri.spring2023.service;

import kr.re.kitri.spring2023.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// @ 빼먹으면 클남!
@Service
public class ProductService {
    //항상 서비스는 레파지토리를 바라보게 되어있음

    @Autowired
    private ProductDao dao;

    public String getAllProducts(){
        // 1-4아래 기능을 수행하는게 Service
        // 1. 상품 DB에 접속한다.
        // 2. select * from products;
        // 3. 결과를 자바타입으로 변환하여..
        // 4. (JSON 형태로 바꾸어) 응답한다.

//        return "전체 상품 목록 전달합니다~";
        return dao.selectAllProductList();
    }
}

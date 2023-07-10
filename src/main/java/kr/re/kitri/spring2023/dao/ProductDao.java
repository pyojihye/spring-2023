package kr.re.kitri.spring2023.dao;

import org.springframework.stereotype.Repository;

@Repository
public class ProductDao {
    public String selectAllProductList(){
        return "모든 상품 조회해서 넘겨 드려요..";
    }
}

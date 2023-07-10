package kr.re.kitri.spring2023.dao;

import org.springframework.stereotype.Repository;

@Repository
public class ArticleDao {
    public String selectAllArticles(){
        return "미니 인스타그램의 전체 글 보기";
    }
}

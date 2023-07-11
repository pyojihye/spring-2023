package kr.re.kitri.spring2023.dao;

import kr.re.kitri.spring2023.model.Article;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ArticleDao {
//    public String selectAllArticles(){
//        return "미니 인스타그램의 전체 글 보기";


    public List<Article> selectAllArticles(){
        List<Article> article = new ArrayList<>();

        article.add(new Article(1, "스프링", "재밌어요", "kim"));
        article.add(new Article(2, "런던", "여행", "park"));
        article.add(new Article(3, "겨울", "춥다", "choi"));

        return article;
    }
}

package kr.re.kitri.spring2023.service;

import kr.re.kitri.spring2023.dao.ArticleDao;
import kr.re.kitri.spring2023.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {

    @Autowired
    private ArticleDao dao;

//    public String getAllArticles(){
//        return dao.selectAllArticles();
//    }

    public List<Article> getAllArticle(){
        return dao.selectAllArticles();
    }
}

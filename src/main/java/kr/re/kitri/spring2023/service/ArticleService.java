package kr.re.kitri.spring2023.service;

import kr.re.kitri.spring2023.dao.ArticleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {

    @Autowired
    private ArticleDao dao;

    public String getAllArticles(){
        return dao.selectAllArticles();
    }

    public List<Article> getAllPosts(){
        return dao.selectAllArticles();
    }
}

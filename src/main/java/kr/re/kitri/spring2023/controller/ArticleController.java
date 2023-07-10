package kr.re.kitri.spring2023.controller;

import kr.re.kitri.spring2023.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleController {

    @Autowired
    private ArticleService service;

    @GetMapping("/posts")
    public String posts(){
        return service.getAllArticles();
    }
}

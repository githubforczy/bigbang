package com.eleven.rick.article.controller;

import com.eleven.rick.article.dto.ArticleDTO;
import com.eleven.rick.article.entity.Article;
import com.eleven.rick.article.service.ArticleService;
import com.eleven.rick.response.RickResult;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/anon/article"})
public class AnonArticleController {

    @Autowired
    private ArticleService articleService;

    @GetMapping("/{id}")
    public RickResult<Article> get(@PathVariable("id") Long id){
        return RickResult.success(articleService.getById(id));
    }

    @GetMapping
    public RickResult<List<ArticleDTO>> getAll(){
        return RickResult.success(articleService.getAll());
    }
}

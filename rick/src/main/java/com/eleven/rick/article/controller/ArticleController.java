package com.eleven.rick.article.controller;

import com.eleven.rick.article.entity.Article;
import com.eleven.rick.article.service.ArticleService;
import com.eleven.rick.response.RickResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/article"})
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @PostMapping("/edit")
    public RickResult<Article> create(@Validated @RequestBody Article article){
        articleService.saveOrUpdate(article);
        Article articleResult = articleService.getById(article.getId());
        return RickResult.success(articleResult);
    }

    @DeleteMapping("/{id}")
    public RickResult deleted(@PathVariable("id") Long id){
        articleService.deletedById(id);
        return RickResult.success(null);
    }

}

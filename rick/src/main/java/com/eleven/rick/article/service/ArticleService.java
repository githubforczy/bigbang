package com.eleven.rick.article.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.eleven.rick.article.dto.ArticleDTO;
import com.eleven.rick.article.entity.Article;
import java.util.List;

public interface ArticleService extends IService<Article> {

    List<ArticleDTO> getAll();

   void deletedById(Long id);
}

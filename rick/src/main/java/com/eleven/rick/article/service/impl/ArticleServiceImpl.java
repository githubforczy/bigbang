package com.eleven.rick.article.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.eleven.rick.article.dto.ArticleDTO;
import com.eleven.rick.article.entity.Article;
import com.eleven.rick.article.service.ArticleService;
import com.eleven.rick.mapper.ArticleMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public List<ArticleDTO> getAll() {
        return articleMapper.getAll();
    }

    @Override
    public void deletedById(Long id) {
        articleMapper.deleteById(id);
    }
}

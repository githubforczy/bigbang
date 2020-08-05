package com.eleven.rick.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.eleven.rick.article.dto.ArticleDTO;
import com.eleven.rick.article.entity.Article;
import java.util.List;
import org.apache.ibatis.annotations.Select;

public interface ArticleMapper extends BaseMapper<Article> {

    @Select("SELECT*FROM r_article ORDER BY id DESC")
    List<ArticleDTO> getAll();
}

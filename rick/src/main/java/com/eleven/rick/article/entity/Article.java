package com.eleven.rick.article.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.eleven.rick.framework.base.entity.BaseEntity;
import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@TableName("r_article")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Article extends BaseEntity {

    /**
     * 文章标题
     */
    private String title;

    /**
     * 文章描述
     */
    private String description;

    /**
     * 文章内容
     */
    private String content;

    /**
     * 文章类型
     */
    private String type;

    /**
     * 已读人数
     */
    private Integer readedNum;

    /**
     * 点赞人数
     */
    private Integer likeNum;

}

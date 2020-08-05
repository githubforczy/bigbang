package com.eleven.rick.article.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.eleven.rick.framework.base.entity.BaseEntity;
import java.time.LocalDateTime;
import java.util.Date;
import javax.validation.constraints.NotBlank;
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
    @NotBlank(message = "文章标题不能为空")
    private String title;

    /**
     * 文章描述
     */
    @NotBlank(message = "文章描述不能为空")
    private String description;

    /**
     * 文章内容
     */
    @NotBlank(message = "文章内容不能为空")
    private String content;

    /**
     * 文章类型
     */
    @NotBlank(message = "文章类型不能为空")
    private String type;

    /**
     * 已读人数
     */
    private Integer readedNum;

    /**
     * 点赞人数
     */
    private Integer likeNum;

    public Article(Long id, Boolean deleted, Long createBy, Date createTime,
        Long updateBy, Date updateTime, Long proxyBy,
        @NotBlank(message = "文章标题不能为空") String title,
        @NotBlank(message = "文章描述不能为空") String description,
        @NotBlank(message = "文章内容不能为空") String content,
        @NotBlank(message = "文章类型不能为空") String type, Integer readedNum, Integer likeNum) {
        super(id, deleted, createBy, createTime, updateBy, updateTime, proxyBy);
        this.title = title;
        this.description = description;
        this.content = content;
        this.type = type;
        this.readedNum = readedNum;
        this.likeNum = likeNum;
    }
}

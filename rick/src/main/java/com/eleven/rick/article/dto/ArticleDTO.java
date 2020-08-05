package com.eleven.rick.article.dto;

import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArticleDTO {
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
}

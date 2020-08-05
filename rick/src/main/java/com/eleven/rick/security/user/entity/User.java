package com.eleven.rick.security.user.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.eleven.rick.framework.base.entity.BaseEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@TableName("r_user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User extends BaseEntity {

    /**
     * 用户名
     */
    private String username;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 用户头像
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private String nickName;

    /**
     * 用户头像
     */
    private String avatar;

    /**
     * 用户类型
     */
    private String type;

    /**
     * 用户是否禁用
     */
    private Boolean disable;

    /**
     * 用户最后登陆时间
     */
    private Date lastLoginTime;


    @Builder
    public User(Long id, Boolean deleted, Long createBy, Date createTime, Long updateBy,
        Date updateTime, Long proxyBy, String username, String password, String nickName,
        String avatar, String type, Boolean disable, Date lastLoginTime) {
        super(id, deleted, createBy, createTime, updateBy, updateTime, proxyBy);
        this.username = username;
        this.password = password;
        this.nickName = nickName;
        this.avatar = avatar;
        this.type = type;
        this.disable = disable;
        this.lastLoginTime = lastLoginTime;
    }
}

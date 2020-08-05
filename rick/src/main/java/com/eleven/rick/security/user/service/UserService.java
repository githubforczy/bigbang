package com.eleven.rick.security.user.service;

import com.eleven.rick.security.user.dto.LoginUserDTO;
import com.eleven.rick.security.user.entity.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public interface UserService {

    /**
     * 用户注册
     * @param loginUserDTO
     */
    void registeUser(LoginUserDTO loginUserDTO);

    /**
     * 根据用户名获取用户信息
     * @param username
     * @return
     */
    User getByUsername(String username);

    /**
     * 更新用户信息
     * @param user
     */
    void updateUser(User user);

    default void encryptPassword(User user){
        String password = user.getPassword();
        password = new BCryptPasswordEncoder().encode(password);
        user.setPassword(password);
    }

}

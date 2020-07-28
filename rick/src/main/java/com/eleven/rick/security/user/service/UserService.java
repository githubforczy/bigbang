package com.eleven.rick.security.user.service;

import com.eleven.rick.security.user.dto.LoginUserDTO;
import com.eleven.rick.security.user.entity.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public interface UserService {

    void registeUser(LoginUserDTO loginUserDTO);

    User getByUsername(String username);

    void updateUser(User user);

    default void encryptPassword(User user){
        String password = user.getPassword();
        password = new BCryptPasswordEncoder().encode(password);
        user.setPassword(password);
    }

}

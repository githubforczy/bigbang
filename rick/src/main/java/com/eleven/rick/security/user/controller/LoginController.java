package com.eleven.rick.security.user.controller;

import com.eleven.rick.response.RickResult;
import com.eleven.rick.security.user.dto.LoginUserDTO;
import com.eleven.rick.security.user.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @GetMapping("/login")
    public RickResult<User> login(LoginUserDTO loginUserDTO){
        return RickResult.success(User.builder().username("admin").build());
    }

}

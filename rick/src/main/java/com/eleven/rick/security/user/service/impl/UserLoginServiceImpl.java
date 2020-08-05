package com.eleven.rick.security.user.service.impl;

import com.eleven.rick.security.user.dto.LoginUserDTO;
import com.eleven.rick.security.user.entity.User;
import com.eleven.rick.security.user.service.UserLoginService;
import com.eleven.rick.security.user.service.UserService;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service
public class UserLoginServiceImpl implements UserLoginService {

    @Autowired
    private UserService userService;

    @Resource
    private PasswordEncoder passwordEncoder;

    @Override
    public User checkPwd(LoginUserDTO loginUserDTO) {
        User user = userService.getByUsername(loginUserDTO.getUsername());
        boolean matchesResult = passwordEncoder.matches(loginUserDTO.getPassword(), user.getPassword());
        Assert.isTrue(matchesResult,"用户名密码不正确");
        return user;
    }
}

package com.eleven.rick.security.user.service.impl;

import com.eleven.rick.mapper.UserMapper;
import com.eleven.rick.security.user.dto.LoginUserDTO;
import com.eleven.rick.security.user.entity.User;
import com.eleven.rick.security.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void registeUser(LoginUserDTO loginUserDTO) {
        User user = User.builder()
            .username(loginUserDTO.getUsername())
            .password(loginUserDTO.getPassword())
            .nickName(loginUserDTO.getNickName())
            .build();
        this.encryptPassword(user);
        userMapper.insert(user);
    }

    @Override
    public User getByUsername(String username) {
        return userMapper.queryByUsername(username);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateById(user);
    }

}

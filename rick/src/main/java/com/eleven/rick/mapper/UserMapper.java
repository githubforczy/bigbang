package com.eleven.rick.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.eleven.rick.security.user.entity.User;

public interface UserMapper extends BaseMapper<User> {
    User queryByUsername(String username);
}

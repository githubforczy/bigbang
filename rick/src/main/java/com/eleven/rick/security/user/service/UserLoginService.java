package com.eleven.rick.security.user.service;

import com.eleven.rick.security.user.dto.LoginUserDTO;
import com.eleven.rick.security.user.entity.User;

public interface UserLoginService {

    /**
     * 校验用户登陆密码
     * @param loginUserDTO
     * @return
     */
    User checkPwd(LoginUserDTO loginUserDTO);
}

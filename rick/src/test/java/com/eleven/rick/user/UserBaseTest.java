package com.eleven.rick.user;

import com.eleven.rick.mapper.UserMapper;
import com.eleven.rick.security.user.dto.LoginUserDTO;
import com.eleven.rick.security.user.entity.User;
import com.eleven.rick.security.user.service.UserService;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserBaseTest {

    @Autowired
    private UserService userService;

    @Test
    public void createUserTest(){
        LoginUserDTO loginUserDTO = LoginUserDTO.builder()
            .nickName("zhangsan")
            .username("user_zs")
            .password("123123")
            .build();
        userService.registeUser(loginUserDTO);
    }

    @Test
    public void getUserListTest(){
        User user = userService.getByUsername("admin");
        System.out.println(user);
    }

    @Test
    public void updateUser() {
        User user = userService.getByUsername("admin");
        user.setPassword("111222");
        userService.updateUser(user);
    }

}

package com.eleven.rick.security.user.controller;

import com.eleven.rick.response.RickResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/test"})
public class TestController {

    @GetMapping("/my_name")
    public RickResult<String> test(){
        return RickResult.success("czy");
    }

}

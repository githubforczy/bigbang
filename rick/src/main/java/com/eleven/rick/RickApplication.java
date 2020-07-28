package com.eleven.rick;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
public class RickApplication {

    public static void main(String[] args) {
        SpringApplication.run(RickApplication.class, args);
    }

}

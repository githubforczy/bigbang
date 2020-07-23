package com.eleven.rick.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private SecurityProperties securityProperties;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
            // 设置可以匿名访问的url
            .antMatchers(securityProperties.getAnonymousArray()).permitAll()
            // 其它所有请求都要认证
            .anyRequest().authenticated()
            .and()
            .formLogin()
            // 自定义登录页
            .loginPage(securityProperties.getLoginPage())
            //.successHandler(myAuthenticationSuccessHandler)
            //.failureHandler(new MyAuthenctiationFailureHandler(securityProperties.getLoginPage()))
            // 自定义登录请求路径
            .loginProcessingUrl(securityProperties.getLoginProcessingUrl())
            .permitAll()
            .and()
            .logout()
            //.logoutSuccessHandler(myLogoutSuccessHandler)
            .permitAll()
            .and()
            .exceptionHandling();
            // 自定义认证失败处理器;

        // 禁用CSRF
        http.csrf().disable();
    }
}

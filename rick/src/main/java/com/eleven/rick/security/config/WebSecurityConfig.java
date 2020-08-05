package com.eleven.rick.security.config;

import com.eleven.rick.security.service.impl.RickUserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableWebSecurity
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private SecurityProperties securityProperties;


    private RickUserDetailService rickUserDetailService;

    @Autowired
    WebSecurityConfig(RickUserDetailService rickUserDetailService){
        this.rickUserDetailService = rickUserDetailService;
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(rickUserDetailService)
            .passwordEncoder(passwordEncoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
            .antMatchers(securityProperties.getAnonymousArray()).permitAll()
            .and()
            .formLogin()
            .loginPage(securityProperties.getLoginPage())
            .loginProcessingUrl(securityProperties.getLoginProcessingUrl())
            .permitAll()
            .and()
            .logout().logoutUrl("/logout").logoutSuccessUrl("/login")
            .and()
            .csrf().disable();
    }

    @Bean
   public BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
   }
}

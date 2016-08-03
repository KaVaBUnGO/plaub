package com.plaub.config;

import org.springframework.boot.autoconfigure.security.*;
import org.springframework.context.annotation.*;
import org.springframework.core.annotation.*;
import org.springframework.security.config.annotation.method.configuration.*;
import org.springframework.security.config.annotation.web.builders.*;
import org.springframework.security.config.annotation.web.configuration.*;
import org.springframework.security.web.util.matcher.*;

/**
 * Created by Chernov Artur on 03.08.2016.
 */

@Configuration
@EnableGlobalMethodSecurity(securedEnabled = true)
@Order( SecurityProperties.ACCESS_OVERRIDE_ORDER)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http.authorizeRequests()
        .antMatchers("/").permitAll().anyRequest().fullyAuthenticated().and().formLogin().loginPage("/login").failureUrl("/login?error").permitAll()
        .and().logout()
        .logoutSuccessUrl( "/" ).logoutRequestMatcher(new AntPathRequestMatcher("/logout")).and()
        .exceptionHandling().accessDeniedPage("/access?error");
  }
}

package com.expava.gpp.contentmanagement.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
    @Override
    public void configure(HttpSecurity http) throws Exception {
    	http.csrf().disable();
        http.authorizeRequests()
            	.antMatchers("/","/index").permitAll()
            	.anyRequest().authenticated()
            	.and()
                .exceptionHandling()
                .accessDeniedPage("/forbidden")
                .and()
            .formLogin()
                .loginPage("/login")
                .permitAll()
                .and()
            .logout()
                .permitAll();
    }
    
    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
    	auth.inMemoryAuthentication()
    		.withUser("user").password("{noop}password").roles("USER");
    }
    
}

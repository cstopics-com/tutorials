package com.expava.gpp.contentmanagement.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.expava.gpp.contentmanagement.service.UserService;
import com.expava.gpp.contentmanagement.service.UserServiceImpl;

@Configuration
public class ContentManagementConfiguration {

	@Bean
	public UserService userService() {
		return new UserServiceImpl();
	}
}

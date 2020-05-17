package com.expava.gpp.contentmanagement;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.expava.gpp.contentmanagement.service.UserService;

@SpringBootApplication
public class ContentManagementApplication {


	@Autowired
	private UserService userService;
	
	public static void main(String[] args) {
		SpringApplication.run(ContentManagementApplication.class, args);
	}

	@PostConstruct
	void init() {
		userService.getAllUsers().stream().forEach(System.out::println);
	}
	
}

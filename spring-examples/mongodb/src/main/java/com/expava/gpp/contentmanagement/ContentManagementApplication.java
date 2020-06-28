package com.expava.gpp.contentmanagement;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.expava.gpp.contentmanagement.service.ArticleService;
import com.expava.gpp.contentmanagement.service.UserService;

@SpringBootApplication
@EnableAspectJAutoProxy
public class ContentManagementApplication {


	@Autowired
	private ArticleService articleService;
	
	public static void main(String[] args) {
		SpringApplication.run(ContentManagementApplication.class, args);
	}

	@PostConstruct
	void init() {
		
	}
	
}

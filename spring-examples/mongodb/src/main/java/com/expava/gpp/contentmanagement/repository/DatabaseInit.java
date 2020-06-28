package com.expava.gpp.contentmanagement.repository;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.expava.gpp.contentmanagement.model.Article;

@Component
public class DatabaseInit {

	@Autowired
	private ArticleRepository articleRepository;

	@PostConstruct
	public void fillDatabase() {
		articleRepository.save(new Article("ABCD1234", "ContentA"));
		articleRepository.save(new Article("QWER9876", "ContentB"));
		articleRepository.save(new Article("YXCVBNML", "ContentC"));
	}
}

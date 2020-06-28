package com.expava.gpp.contentmanagement.service;



import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.expava.gpp.contentmanagement.model.Article;
import com.expava.gpp.contentmanagement.repository.ArticleRepository;

@Component
public class ArticleServiceImpl implements ArticleService {

	@Autowired
    private ArticleRepository repository;


	Logger logger = LoggerFactory.getLogger(ArticleServiceImpl.class);

	
	@Override
	public Article getArticleById(String articleId) {
		logger.info("getArticleById: "+articleId);
		return new Article(articleId);
	}
	
	@Override
	public List<Article> getAllArticles() {
		logger.info("getAllArticles: ");
		List<Article> list = new ArrayList<>();
		repository.findAll().forEach(list::add);
		return list;
	}

}


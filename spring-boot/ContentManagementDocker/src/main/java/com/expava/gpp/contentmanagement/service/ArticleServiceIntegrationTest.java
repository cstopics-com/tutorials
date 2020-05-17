package com.expava.gpp.contentmanagement.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.expava.gpp.contentmanagement.model.Article;

@Component
@Profile("integrationtest")
public class ArticleServiceIntegrationTest implements ArticleService {

	Logger logger = LoggerFactory.getLogger(ArticleServiceImpl.class);

	
	@Override
	public Article getArticleById(Long articleId) {
		logger.info("ArticleServiceIntegrationTest");
		return new Article(articleId);
	}


	@Override
	public List<Article> getAllArticles() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String findTitleById(long articleId) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Article findById(long articleId) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public long create(Article article) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void deleteById(long articleId) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void update(Article article) {
		// TODO Auto-generated method stub
		
	}
}

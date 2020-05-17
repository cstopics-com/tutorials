package com.expava.gpp.contentmanagement.service;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.expava.gpp.contentmanagement.model.Article;

@Component
@Profile("dev")
public class ArticleServiceImpl implements ArticleService {

	Logger logger = LoggerFactory.getLogger(ArticleServiceImpl.class);

	
	@Override
	public Article getArticleById(String articleId) {
		logger.info("ArticleServiceImpl");
		return new Article(articleId);
	}
}


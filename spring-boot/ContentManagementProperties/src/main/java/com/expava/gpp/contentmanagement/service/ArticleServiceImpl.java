package com.expava.gpp.contentmanagement.service;



import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.expava.gpp.contentmanagement.model.Article;

@Component
public class ArticleServiceImpl implements ArticleService {

	Logger logger = LoggerFactory.getLogger(ArticleServiceImpl.class);

	@Value("${cms.init.welcome-message: Hello Default!}")
	String message;

	@Value("${cms.init.number}") 
	int number;

	@Value("${cms.init.numbersX}") 
	int[] numbersA;
	
	@Value("${cms.init.numbersX}")
	List<Integer> numbersB;

	@Value("#{'${cms.init.numbersY}'.split(';')}")
	List<Integer> numbersC;

	@Value("${cms.init.display-number}") 
	boolean displayNumber;

	public ArticleServiceImpl(@Value("${cms.init.welcome-message}") String amessage) {
		logger.info("Message 1 : "+amessage);

	}

	@Override
	public Article getArticleById(String articleId) {
		logger.info("Message 2: "+this.message);

		if (displayNumber) {
			logger.info("It is your number: {}", number);
		}
		
		logger.info("It is your numbers A: {}", numbersA);
		logger.info("It is your numbers B: {}", numbersB);
		logger.info("It is your numbers C: {}", numbersC);

		return new Article(articleId);
	}
}


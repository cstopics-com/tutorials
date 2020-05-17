package com.expava.gpp.contentmanagement.service;

import org.springframework.stereotype.Component;

import com.expava.gpp.contentmanagement.model.Article;

@Component
public class ArticleServiceImpl implements ArticleService {

	@Override
	public Article getArticleById(String articleId) {
		try {
			Thread.sleep((long) (Math.random() * 5000));
		} catch (InterruptedException e) {
		}
		return new Article(articleId);
	}
}

 
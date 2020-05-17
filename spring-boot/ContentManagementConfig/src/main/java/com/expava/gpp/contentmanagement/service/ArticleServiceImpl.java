package com.expava.gpp.contentmanagement.service;

import org.springframework.stereotype.Component;

import com.expava.gpp.contentmanagement.model.Article;

@Component
public class ArticleServiceImpl implements ArticleService {

	@Override
	public Article getArticleById(String articleId) {
		return new Article(articleId);
	}
}

 
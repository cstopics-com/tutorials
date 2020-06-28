package com.expava.gpp.contentmanagement.service;

import java.util.List;

import com.expava.gpp.contentmanagement.model.Article;

public interface ArticleService {
	public Article getArticleById(String articleId);
	public List<Article> getAllArticles();
}

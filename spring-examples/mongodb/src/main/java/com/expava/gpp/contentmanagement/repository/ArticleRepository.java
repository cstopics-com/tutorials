package com.expava.gpp.contentmanagement.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.expava.gpp.contentmanagement.model.Article;

@Repository
public interface ArticleRepository extends MongoRepository<Article, String> {
	Article findByTitle(String title);
}

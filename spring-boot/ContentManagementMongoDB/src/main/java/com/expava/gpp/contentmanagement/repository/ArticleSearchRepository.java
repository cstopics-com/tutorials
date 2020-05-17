package com.expava.gpp.contentmanagement.repository;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.expava.gpp.contentmanagement.model.Article;

@Repository
public class ArticleSearchRepository  {

	@Autowired
	MongoTemplate mongoTemplate;

	public Collection<Article> getAllArticles() {
		return mongoTemplate.findAll(Article.class);
	}

	public Article searchArticleTitle(String text) {
		
		Article topic = mongoTemplate.findOne(Query.query(Criteria.where("title").is(text)), Article.class);
		if(topic == null) {
			topic = mongoTemplate.findOne(Query.query(Criteria.where("title").regex(text, "i")), Article.class);
		}
		return topic;
	}

}

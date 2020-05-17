package com.expava.gpp.contentmanagement.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.expava.gpp.contentmanagement.model.Article;

@Repository
public interface ArticleRepository extends CrudRepository<Article, Long> {

}

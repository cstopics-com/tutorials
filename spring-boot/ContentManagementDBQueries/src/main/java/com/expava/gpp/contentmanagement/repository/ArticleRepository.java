package com.expava.gpp.contentmanagement.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.expava.gpp.contentmanagement.model.Article;

@Repository
public interface ArticleRepository extends CrudRepository<Article, Long> {

	@Query("SELECT t.title FROM Article t where t.id = :id") 
	String findTitleById(@Param("id") Long id);
     
	@Query("SELECT t FROM Article t where t.title = ?1 AND t.content = ?2")
	public Optional<Article> findByTitleAndContent(String title, String content);
 
	@Query("SELECT t FROM Article t where t.title = :title AND t.content = :content")
	public Article findByTitleAndContentWithParam(@Param("title") String title, @Param("content") String content);
	
	@Query(value = "SELECT * FROM Articles t where t.title = :title AND t.content = :content", nativeQuery=true) 
	public List<Article> findAllByTitleAndContent(@Param("title") String title, @Param("content") String content);



}

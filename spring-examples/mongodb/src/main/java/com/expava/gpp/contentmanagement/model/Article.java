package com.expava.gpp.contentmanagement.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "article")
public class Article {

	@Id
	private String id;
	private String title;
	private String content;

	public Article() {
	}

	public Article(String id) {
		this.id = id;
	}
	
	public Article(String title, String content) {
		this.title = title;
		this.content = content;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	@Override
	public String toString() {
		return "Article [id=" + id + "]";
	}
}

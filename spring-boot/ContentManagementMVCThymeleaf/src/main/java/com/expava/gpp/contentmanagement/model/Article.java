package com.expava.gpp.contentmanagement.model;

public class Article {

	private String id;

	public Article(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Article [id=" + id + "]";
	}

}

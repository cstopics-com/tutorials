package com.expava.gpp.contentmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.expava.gpp.contentmanagement.model.Article;
import com.expava.gpp.contentmanagement.model.UserList;
import com.expava.gpp.contentmanagement.model.UserNotFoundException;
import com.expava.gpp.contentmanagement.service.ArticleService;
import com.expava.gpp.contentmanagement.service.UserService;

@RestController
@RequestMapping("/rest")
public class ControllerRest {

	@Autowired
	private ArticleService articleService;
	
	@Autowired
	private UserService userService;

	@RequestMapping("/articles")
	public List<Article> getArticles() {
		return articleService.getAllArticles();
	}

	@RequestMapping({"/allusers","users*","userlist/*"})
	public UserList getAllUsers() {
		UserList userList = new UserList();
		userList.setUsers(userService.getAllUsers());
		return userList;
	}

	@GetMapping("/userfound/{found}")
	String getUserC(@PathVariable("found") String found) throws UserNotFoundException {

		if(found.toLowerCase().equals("no")) {
			throw new UserNotFoundException("Unfortunately user not found!!!");
		}

		return "FOUND";
	}

}

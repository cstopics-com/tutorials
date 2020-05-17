package com.expava.gpp.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.expava.gpp.springcloud.service.feign.JSONPlaceHolderServiceFeign;

@Controller
public class FrontendServiceControllerFeign {
	
	@Autowired
	JSONPlaceHolderServiceFeign jsonPlaceHolderServiceFeign;

	@GetMapping("/posts-feign")
	String direct(Model model) {
		
		model.addAttribute("posts", jsonPlaceHolderServiceFeign.getPosts());

		return "posts";
	}
}

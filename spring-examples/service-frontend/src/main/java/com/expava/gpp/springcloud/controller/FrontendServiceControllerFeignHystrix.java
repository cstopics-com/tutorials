package com.expava.gpp.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.expava.gpp.springcloud.service.feign.hystrix.JSONPlaceHolderServiceFeignHystrix;


@Controller
public class FrontendServiceControllerFeignHystrix {

	@Autowired
	JSONPlaceHolderServiceFeignHystrix jsonPlaceHolderServiceFeignHystrix;

	@GetMapping("/posts-feign-hystrix")
	String direct(Model model) {
		
		model.addAttribute("posts", jsonPlaceHolderServiceFeignHystrix.getPosts());

		return "posts";
	}
}

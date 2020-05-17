package com.expava.gpp.springcloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontendServiceControllerZuul {

	@GetMapping("/zuul-angular")
	String direct(Model model) {
		
		return "zuul-angular";
	}
}

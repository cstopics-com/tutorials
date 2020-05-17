package com.expava.gpp.contentmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.expava.gpp.contentmanagement.model.User;

@Controller
@SessionAttributes("user")
public class ControllerMVC {

	@GetMapping({"/","/index"})
	String index() {
		return "index";
	}
	
	@GetMapping("/user/{name}")
	String getUserA(Model model,
			@PathVariable("name") String name) {

		User user = new User();
		user.setFirstname(name);
		model. addAttribute("user",user);

		return "user-template";
	}
	
	@GetMapping("/sessionuser")
	String getUserB() {
		return "user-template";
	}
	
	@GetMapping("/redirect")
	String getRedirectView(Model model,@RequestParam("attribute") String attribute) {
		model.addAttribute("attribute",attribute);
		return "redirect-template";
	}
	
	@GetMapping("/redirectWithRedirectView")
	public RedirectView redirectWithUsingRedirectView(RedirectAttributes attributes) {
		attributes.addFlashAttribute("flashAttribute", "redirect-With-Redirect-View-FlashAttribute");
		attributes.addAttribute("attribute", "redirect-With-Redirect-View-Attribute");
		return new RedirectView("redirect");
	}
}

package com.expava.gpp.contentmanagement.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.expava.gpp.contentmanagement.model.User;
import com.expava.gpp.contentmanagement.service.UserService;

@Controller
@SessionAttributes("user")
public class ControllerMVC {

	@Autowired
	private UserService userService;

	@GetMapping("/user/{name}")
	String getUserA(Model model,
			@PathVariable("name") String name) {

		User user = new User();
		user.setFirstname(name);
		user.setLastname(name);
		model. addAttribute("user",user);

		return "user-template";
	}
	
	@GetMapping("/users")
	String getAllUsers(Model model) {
		
		model.addAttribute("users", userService.getAllUsers());

		return "users-template";
	}

	@GetMapping("/user-form")
	String getUserForm(Model model) {
		
		model. addAttribute("user",new User("","",'N'));
		
		return "user-input-template";
	}

    @RequestMapping(value = "/saveuser", method = RequestMethod.POST)
    public String saveUser(@Valid @ModelAttribute User user, BindingResult errors, Model model) {
        
   		model.addAttribute("user",user);
        return ((errors.hasErrors()) ? "user-input-template" : "user-template");
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

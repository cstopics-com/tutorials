package com.kobdan.vault;

import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@Autowired
	CredentialsService credentialsService;
	
	@GetMapping("/")
	String index() throws URISyntaxException {
		return "OK";
	}
	
	
	@GetMapping("/w")
	String setCredentials() throws URISyntaxException {
		Credentials credentials = new Credentials("username", "password");
		credentialsService.secureCredentials(credentials);
		return "Write: "+credentials.getUsername()+" / "+credentials.getPassword();
	}
	
	@GetMapping("/r")
	String getCredentials() throws URISyntaxException {
		Credentials credentials = credentialsService.accessCredentials();
		return "Read: "+credentials.getUsername()+" / "+credentials.getPassword();
	}
}

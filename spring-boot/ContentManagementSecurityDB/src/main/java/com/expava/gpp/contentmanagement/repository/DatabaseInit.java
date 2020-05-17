package com.expava.gpp.contentmanagement.repository;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import com.expava.gpp.contentmanagement.model.User;

@Component
public class DatabaseInit {

	@Autowired
	private UserRepository userRepository;

	@PostConstruct
	public void fillDatabase() {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		User user = new User();
		user.setEnabled(true);
		user.setFirstname("Hana");
		user.setLastname("Mana");
		user.setUsername("hana");
		user.setPassword(passwordEncoder.encode("1234"));
		userRepository.save(user);
	}
}

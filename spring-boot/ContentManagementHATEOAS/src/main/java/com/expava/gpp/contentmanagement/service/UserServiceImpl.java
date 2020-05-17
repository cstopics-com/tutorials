package com.expava.gpp.contentmanagement.service;

import java.util.Arrays;
import java.util.List;

import com.expava.gpp.contentmanagement.model.User;


public class UserServiceImpl implements UserService {

	@Override
	public List<User> getAllUsers() {
		return Arrays.asList(new User("Otto", "Matic"), new User("Tara", "Misu"), new User("Max", "Power"));
	}

	@Override
	public User findByName(String name) {
        if(name.toLowerCase().equals("otto")) {
        	return new User("Otto", "Matic");
        } else if(name.toLowerCase().equals("tara")) {
        	return new User("Tara", "Misu");
        } else if(name.toLowerCase().equals("max")) {
        	return new User("Max", "Power");
        }
		return null;
	}
}

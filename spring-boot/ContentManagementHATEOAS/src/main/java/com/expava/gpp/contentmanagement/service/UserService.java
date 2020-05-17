package com.expava.gpp.contentmanagement.service;

import java.util.List;

import com.expava.gpp.contentmanagement.model.User;

public interface UserService {
	List<User> getAllUsers();
	User findByName(String name);
}
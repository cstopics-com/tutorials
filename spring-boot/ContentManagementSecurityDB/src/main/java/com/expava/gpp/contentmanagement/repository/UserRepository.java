package com.expava.gpp.contentmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.expava.gpp.contentmanagement.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	 
    User findByUsername(String username);
}

package com.expava.gpp.springcloud.repository;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.expava.gpp.springcloud.model.Customer;

@Component
public class DatabaseInit {

	@Autowired
	private CustomerRepository customerRepository;

	@PostConstruct
	public void fillDatabase() {
		customerRepository.save(new Customer("Max", "Kim"));
		customerRepository.save(new Customer("Tara", "Misu"));
		customerRepository.save(new Customer("Ahmed", "James"));
	}
}

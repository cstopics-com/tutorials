package com.expava.gpp.springcloud.repository;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.expava.gpp.springcloud.model.Product;

@Component
public class DatabaseInit {

	@Value("${server.port}")
    private String server_port;
	
	@Autowired
	private ProductRepository productRepository;

	@PostConstruct
	public void fillDatabase() {
		productRepository.save(new Product("ProductA", "DescriptionA "+server_port));
		productRepository.save(new Product("ProductB", "DescriptionB "+server_port));
		productRepository.save(new Product("ProductC", "DescriptionC "+server_port));
	}
}

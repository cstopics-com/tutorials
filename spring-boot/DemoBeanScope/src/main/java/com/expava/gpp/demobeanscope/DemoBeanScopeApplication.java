package com.expava.gpp.demobeanscope;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoBeanScopeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoBeanScopeApplication.class, args);
	}

	@Autowired
	Counter counter;
	
	@Autowired
	DummyComponent dummyComponent;
	
	@PostConstruct
	void dummyTask( ) {
		counter.count();
		System.out.println("DemoBeanScopeApplication: counter = "+counter.getCound());
		
		dummyComponent.dummyTask();
	}
}

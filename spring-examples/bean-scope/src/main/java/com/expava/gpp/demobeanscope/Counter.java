package com.expava.gpp.demobeanscope;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Counter {

	int counter;
	
	@PostConstruct
	public void init() {
		counter = 0;
	}
	
	public void count() {
		counter++;
	}
	
	public int getCound() {
		return counter;
	}
}

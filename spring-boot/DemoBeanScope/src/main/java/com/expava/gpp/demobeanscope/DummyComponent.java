package com.expava.gpp.demobeanscope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DummyComponent {
	
	@Autowired
	Counter counter;
	
	void dummyTask( ) {
		System.out.println("DummyComponent: counter = "+counter.getCound());
	}
}

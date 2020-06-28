package com.expava.gpp.demobeanlifecycle;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoBeanLifecycleApplication {

	public static void main(String[] args) {
		AbstractApplicationContext  context = new ClassPathXmlApplicationContext("beans.xml"); 
		User obj = (User) context.getBean("demoUser");    
		context.registerShutdownHook();
	}

}

package com.expava.gpp.demobean;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DemoBeanApplication {

	public static void main(String[] args) {
		AbstractApplicationContext  context = new ClassPathXmlApplicationContext("beans.xml"); 
		DemoBean obj = (DemoBean) context.getBean("demoBean");    
		obj.getMessage();
		context.registerShutdownHook();
	}

}

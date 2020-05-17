package com.expava.gpp.demobean;

public class DemoBean {
	private String message;

	public void setMessage(String message) { 
		this.message  = message; 
	}  
	public void getMessage(){ 
		System.out.println("My Message : " + message); 
	} 

	public void init(){
		System.out.println("Bean is going through init.");
	}
	public void destroy(){
		System.out.println("Bean will destroy now.");
	}
}

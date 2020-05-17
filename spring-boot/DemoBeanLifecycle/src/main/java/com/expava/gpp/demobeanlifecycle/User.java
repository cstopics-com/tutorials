package com.expava.gpp.demobeanlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class User implements DisposableBean, InitializingBean {
	private String name;
	 
    User() {
        System.out.println("Constructor of user bean is invoked!");
    }
 
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
 
    //Bean initialization code
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing method of person bean is invoked!");
    }
 
    //Bean destruction code
    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy method of person bean is invoked!");
    }
    
    public void init(){
		System.out.println("User is going through init.");
	}
	public void afterDestroy(){
		System.out.println("User will destroy now.");
	}
}

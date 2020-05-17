package com.expava.gpp.demolog;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoLogApplication {

	static Logger logger = LoggerFactory.getLogger(DemoLogApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(DemoLogApplication.class, args);
	}

	@PostConstruct
	void init() {
		logger.trace("A TRACE Message");
        logger.debug("A DEBUG Message");
        logger.info("An INFO Message");
        logger.warn("A WARN Message");
        logger.error("An ERROR Message");
        
       
	}
}

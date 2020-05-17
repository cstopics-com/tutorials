package com.expava.gpp.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class ServerlessApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerlessApplication.class, args);
	}

	@Bean
    public Function<String, String> reverse() {
        return value -> new StringBuilder(value).reverse().toString()+"\n";
    }
}

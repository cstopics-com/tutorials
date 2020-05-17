package com.expava.gpp.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "eurekaserver", configuration = RibbonConfiguration.class)
@EnableCircuitBreaker
@EnableHystrixDashboard
@EnableFeignClients
@EnableZuulProxy
public class FrontendServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FrontendServiceApplication.class, args);
	}
	
	@Bean
	public RestTemplate simpleRestTemplate() {
	    return new RestTemplate();
	}

	@LoadBalanced
	@Bean
	public RestTemplate lbRestTemplate() {
	    return new RestTemplate();
	}
	
	@LoadBalanced
	@Bean
	public RestTemplate ribbonRestTemplate() {
	    return new RestTemplate();
	}
}

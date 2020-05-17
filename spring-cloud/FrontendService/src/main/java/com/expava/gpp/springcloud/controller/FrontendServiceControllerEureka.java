package com.expava.gpp.springcloud.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import com.expava.gpp.springcloud.model.Customer;
import com.expava.gpp.springcloud.model.Product;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;

@Controller
public class FrontendServiceControllerEureka {

	@Autowired
    private EurekaClient discoveryClient;
	
	@Autowired
	@Qualifier("simpleRestTemplate")
    private RestTemplate simpleRestTemplate;
	
	@GetMapping("/customer-product-via-eureka")
	String usingEureka(Model model) {
		
		final InstanceInfo productServiceInstance = discoveryClient.getNextServerFromEureka("product-service", false);
		final InstanceInfo customerServiceInstance = discoveryClient.getNextServerFromEureka("customer-service", false);
	    
		System.out.println("Service-URL from Eureka for Customer-Service: "+customerServiceInstance.getHomePageUrl());
		System.out.println("Service-URL from Eureka for Product-Service:  "+productServiceInstance.getHomePageUrl());
		
		ArrayList<Customer> customers = simpleRestTemplate.getForObject(customerServiceInstance.getHomePageUrl()+"api/customer", ArrayList.class);
		ArrayList<Product> products = simpleRestTemplate.getForObject(productServiceInstance.getHomePageUrl()+"api/product", ArrayList.class);
		
		model.addAttribute("customers", customers);
		model.addAttribute("products", products);

		return "customer-product";
	}
}

package com.expava.gpp.springcloud.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import com.expava.gpp.springcloud.model.Customer;
import com.expava.gpp.springcloud.model.Product;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;

@Controller
public class FrontendServiceController {
	
	@GetMapping("/")
	String index() {
		return "index";
	}
	
	@GetMapping("/customer-product-directly")
	String direct(Model model) {
		
	    RestTemplate simpleRestTemplate = new RestTemplate();
	    
		ArrayList<Customer> customers = simpleRestTemplate.getForObject("http://localhost:8082/api/customer", ArrayList.class);
		ArrayList<Product> products = simpleRestTemplate.getForObject("http://localhost:8081/api/product", ArrayList.class);
		
		model.addAttribute("customers", customers);
		model.addAttribute("products", products);

		return "customer-product";
	}
}

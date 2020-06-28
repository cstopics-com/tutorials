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

@Controller
public class FrontendServiceControllerEurekaLB {

	@Autowired
	@Qualifier("lbRestTemplate")
    private RestTemplate lbRestTemplate;

	@GetMapping("/customer-product-via-eureka-lb")
	String usingRibbonEureka(Model model) {
		
	    
		ArrayList<Customer> customers = lbRestTemplate.getForObject("http://customer-service/api/customer", ArrayList.class);
		ArrayList<Product> products = lbRestTemplate.getForObject("http://product-service/api/product", ArrayList.class);
		
		model.addAttribute("customers", customers);
		model.addAttribute("products", products);

		return "customer-product";
	}
}

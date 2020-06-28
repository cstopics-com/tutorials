package com.expava.gpp.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.expava.gpp.springcloud.service.hystrix.CustomerServiceHystrix;
import com.expava.gpp.springcloud.service.hystrix.ProductServiceHystrix;

@Controller
public class FrontendServiceControllerHystrix {

	@Autowired
	ProductServiceHystrix productServiceHystrix;

	@Autowired
	CustomerServiceHystrix customerServiceHystrix;

	@GetMapping("/customer-product-hystrix")
	String direct(Model model) {
		
		model.addAttribute("customers", customerServiceHystrix.callCustomerService());
		model.addAttribute("products", productServiceHystrix.callProductService());

		return "customer-product";
	}
}

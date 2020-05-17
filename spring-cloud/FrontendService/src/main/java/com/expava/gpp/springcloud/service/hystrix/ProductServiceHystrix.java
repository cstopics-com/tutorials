package com.expava.gpp.springcloud.service.hystrix;

import java.util.ArrayList;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.expava.gpp.springcloud.model.Product;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class ProductServiceHystrix {

    @HystrixCommand(fallbackMethod = "callProductService_Fallback")
    public ArrayList<Product> callProductService() {

    	RestTemplate simpleRestTemplate = new RestTemplate();
    	
        System.out.println("Getting list of products");

		ArrayList<Product> products = simpleRestTemplate.getForObject("http://localhost:8081/api/product", ArrayList.class);
 
        return products;
    }
     
    @SuppressWarnings("unused")
    private ArrayList<Product> callProductService_Fallback() {
 
        System.out.println("Product Service is down!!! fallback route enabled...");
        
        ArrayList<Product> products = new ArrayList<Product>();
        products.add(new Product("NO PRODUCT AVAILABLE","CIRCUIT BREAKER ENABLED"));
 
        return products;
    }
}

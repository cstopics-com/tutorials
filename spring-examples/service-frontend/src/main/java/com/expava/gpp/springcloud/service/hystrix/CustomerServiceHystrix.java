package com.expava.gpp.springcloud.service.hystrix;

import java.util.ArrayList;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.expava.gpp.springcloud.model.Customer;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class CustomerServiceHystrix {

	@HystrixCommand(fallbackMethod = "callCustomerService_Fallback")
    public ArrayList<Customer> callCustomerService() {

    	RestTemplate simpleRestTemplate = new RestTemplate();
    	
        System.out.println("Getting list of customers");
 
        ArrayList<Customer> customers = simpleRestTemplate.getForObject("http://localhost:8082/api/customer", ArrayList.class);
 
        return customers;
    }
     
    @SuppressWarnings("unused")
    private ArrayList<Customer> callCustomerService_Fallback() {
 
        System.out.println("Customer Service is down!!! fallback route enabled...");
        
        ArrayList<Customer> customers = new ArrayList<Customer>();
        customers.add(new Customer("NO CUSTOMER AVAILABLE","CIRCUIT BREAKER ENABLED"));
 
        return customers;
    }
}

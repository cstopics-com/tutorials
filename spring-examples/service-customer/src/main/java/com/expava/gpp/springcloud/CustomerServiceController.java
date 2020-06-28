package com.expava.gpp.springcloud;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.expava.gpp.springcloud.model.Customer;
import com.expava.gpp.springcloud.repository.CustomerRepository;

@RestController
@RefreshScope
public class CustomerServiceController {

	@Value("${msg:Hello world - Config Server is not working..pelase check}")
    private String msg;
	
	@RequestMapping("/msg")
    String getMsg() {
        return msg;
    }
	
	@RequestMapping(value = "/")
	public String home() {
		return "Customer Service";
	}

	@Autowired
	CustomerRepository customerRepository;

	@GetMapping(value = "/api/customer")
	public Iterable<Customer> customers() {
		return customerRepository.findAll();
	}

	@GetMapping(value = "/api/customer/{id}")
	public Optional<Customer> customer(@PathVariable("id") Long id) {
		return customerRepository.findById(id);
	}

	@PostMapping("/api/customer")
	@ResponseStatus(HttpStatus.CREATED)
	public Customer createCustomer(@RequestBody Customer resource) {
		return customerRepository.save(resource);
	}
	
	@DeleteMapping("/api/customer/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteCustomer(@PathVariable("id") Long id) {
		customerRepository.deleteById(id);
    }
}

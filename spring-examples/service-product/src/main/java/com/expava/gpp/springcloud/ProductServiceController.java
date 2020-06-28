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

import com.expava.gpp.springcloud.model.Product;
import com.expava.gpp.springcloud.repository.ProductRepository;

@RestController
@RefreshScope
public class ProductServiceController {


	@Value("${server.port}")
    private String server_port;
	
	
	@Value("${msg:Hello world - Config Server is not working..pelase check}")
    private String msg;
	
	@RequestMapping("/msg")
    String getMsg() {
        return msg;
    }
	
	@RequestMapping(value = "/")
	public String home() {
		return "Product Service - "+server_port;
	}

	@Autowired
	private ProductRepository productRepository;

	@GetMapping(value = "/api/product")
	public Iterable<Product> products() {
		return productRepository.findAll();
	}

	@GetMapping(value = "/api/product/{id}")
	public Optional<Product> product(@PathVariable("id") Long id) {
		return productRepository.findById(id);
	}

	@PostMapping("/api/product")
	@ResponseStatus(HttpStatus.CREATED)
	public Product createProduct(@RequestBody Product resource) {
		return productRepository.save(resource);
	}
	
	@DeleteMapping("/api/product/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteProduct(@PathVariable("id") Long id) {
		productRepository.deleteById(id);
    }
}

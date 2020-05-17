package com.expava.gpp.springcloud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

	public String order = "default";

    @GetMapping("/show-order")
    public String showOrder() {
        return order;
    }
}
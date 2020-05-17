package com.expava.gpp.springcloud;

import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

	private MessageChannel orderChannel;

    public ProducerController(OrderBinding binding) {
    	orderChannel = binding.orderChannel();
    }

    @GetMapping("/order/{product}")
    public String publish(@PathVariable String product) {
        String order = "ORDER: " + product;
        Message<String> msg = MessageBuilder.withPayload(order).build();
        orderChannel.send(msg);
        return product+" has been orderd!";
    }
}
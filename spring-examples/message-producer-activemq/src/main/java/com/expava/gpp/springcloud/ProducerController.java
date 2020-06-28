package com.expava.gpp.springcloud;

import javax.jms.Queue;
import javax.jms.Topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

	@Autowired
    private Topic topic;
	
	@Autowired
    private Queue queue;
	
    @Autowired
    private JmsTemplate jmsTemplate;
    
    @GetMapping("/send-order/{product}")
    public String send(@PathVariable String product) {
        String order = "ORDER: " + product;
        jmsTemplate.convertAndSend(queue, order);
        return product+" has been orderd!";
    }
    
    @GetMapping("/publish-order/{product}")
    public String publish(@PathVariable String product) {
        String order = "ORDER: " + product;
        jmsTemplate.convertAndSend(topic, order);
        return product+" has been orderd!";
    }
}
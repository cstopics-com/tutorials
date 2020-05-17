package com.expava.gpp.springcloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;


@Component
@EnableJms
public class OrderReceiver {

	@Autowired
	ConsumerController consumerController;
	
	@JmsListener(destination = "order-queue")
    public void queueListener(String msg){
		consumerController.order = msg;
    }
	
	@JmsListener(destination = "order-topic")
    public void topicListener(String msg){
		consumerController.order = msg;
    }
}

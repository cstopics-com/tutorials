package com.expava.gpp.springcloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@EnableBinding(OrderBinding.class)
public class OrderListener {

	@Autowired
	ConsumerController consumerController;
	
	@StreamListener(target = OrderBinding.orderChannel)
    public void processOrderChannel(String msg) {
		consumerController.order = msg;
    }
}

package com.expava.gpp.springcloud;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface OrderBinding {

	String orderChannel = "orderChannel";

	@Input(orderChannel)
	SubscribableChannel orderChannel();
}

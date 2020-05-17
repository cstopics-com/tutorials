package com.expava.gpp.springcloud;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface OrderBinding {

	@Output("orderChannel")
	MessageChannel orderChannel();
}

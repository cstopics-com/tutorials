package com.expava.gpp.springcloud;

import javax.jms.Queue;

import javax.jms.Topic;
import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JmsConfig {

	@Bean
	public Queue queue(){
		return new ActiveMQQueue("order-queue");
	}

	@Bean
	public Topic topic(){
		return new ActiveMQTopic("order-topic");
	}
}
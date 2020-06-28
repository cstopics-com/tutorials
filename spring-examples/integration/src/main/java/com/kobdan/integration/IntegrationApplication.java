package com.kobdan.integration;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.PollableChannel;
import org.springframework.messaging.support.GenericMessage;

@SpringBootApplication
public class IntegrationApplication {

	public static void main(String[] args) {
		String[] springConfig  =  {"spring/integration/context.xml"};  
		ApplicationContext context = new ClassPathXmlApplicationContext(springConfig);
		
		MessageChannel input = (MessageChannel) context.getBean("input");
		PollableChannel output = (PollableChannel) context.getBean("output");
	    String textMessage = "this message must be sent";
	    System.out.println("send: " + textMessage);
	    input.send(new GenericMessage<String>(textMessage));
	    Message<?> reply = output.receive();
	    System.out.println("receive: " + reply.getPayload());

		MessageChannel inputfile = (MessageChannel) context.getBean("inputfile");
	    System.out.println("send to file: " + textMessage);
	    inputfile.send(new GenericMessage<String>(textMessage));
	    System.out.println("Check File at C:/tmp ");
	}
	
	
}

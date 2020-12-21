package com.assesment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jms.annotation.EnableJms;


@SpringBootApplication
@EnableJms
public class OrderSenderApplication {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication
				.run(OrderSenderApplication.class, args);
	
	}

	}
	


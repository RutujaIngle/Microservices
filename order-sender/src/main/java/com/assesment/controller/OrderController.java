package com.assesment.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assesment.model.ProductOrder;
import com.assesment.service.OrderService;

@RestController
public class OrderController {
	private static final String MESSAGE_QUEUE = "orders_queue";
	@Autowired
	OrderService orderService;
	@Autowired
	ConfigurableApplicationContext context;
	
	@PostMapping("/order")
    public int saveOrder(@RequestBody ProductOrder order) {
		
		//orderService.saveOrder(order); 
		JmsTemplate jmsTemplate = context.getBean(JmsTemplate.class);  //RestTemplate
		jmsTemplate.convertAndSend(MESSAGE_QUEUE, order);
		System.out.println("order sent");
		orderService.saveOrder(order);
		return order.getId();
		
			}
		

	
	
	
}

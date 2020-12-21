package com.example.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.HelloWordDemoApplication;
import com.example.demo.models.Order;
import com.example.demo.service.OrderService;


@RestController


public class OrderController {
	final public Logger logger = LoggerFactory.getLogger(HelloWordDemoApplication.class);
	@Autowired
	OrderService orderService;
	@PostMapping("/home")
	public int createOrder (String Order) {
		logger.debug("created order");
		return orderService.create();
	}
	
	@GetMapping("/order")
	public Order getOrder() {
		logger.debug("getting order");
		return orderService.getOrder();
		
	}
	
	@GetMapping("/allOrders")
	
	public List<Order> getAllOrders(){
		logger.debug("getting order");
		return orderService.getAllOrders();
	}
}

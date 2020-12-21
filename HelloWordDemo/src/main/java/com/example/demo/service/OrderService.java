"package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.example.demo.HelloWordDemoApplication;
import com.example.demo.models.Address;
import com.example.demo.models.Order;

@Service
public class OrderService {
	
	final public Logger logger = LoggerFactory.getLogger(HelloWordDemoApplication.class);
	List <Order> AllOrders = new ArrayList<>();
	public int create() {
		return 1;
		
	}
	public Order getOrder() {
		Address address = new Address();
		List <Address> addresses = new ArrayList<>();
		address.setStreetName("lane");
		address.setPin(1223);
		
		addresses.add(address);
		Order order = new Order();
		order.setId(345);
		order.setItem("mobile");
		order.setPrice(10000);
		order.setAddresses(addresses);
		
		AllOrders.add(order);
		return order;
	}
	
	public List<Order> getAllOrders(){
		
		return AllOrders;
	}

}

package com.assesment.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.stereotype.Service;

import com.assesment.Repository.OrderRepository;
import com.assesment.model.ProductOrder;


@Service
public class OrderService {
	
	@Autowired
	OrderRepository orderRepository;

	public void saveOrder(ProductOrder order) {
			// TODO Auto-generated method stub
		orderRepository.save(order);
				
		}
		
	

	public ProductOrder getOrderById(int iD) {
		// TODO Auto-generated method stub
		return orderRepository.findById(iD).get();  
	}	
	}



package com.receiver.assesment.receiver;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;


import com.receiver.assesment.model.ProductOrder;



@Component
public class MessageReceiver
{
	private static final String MESSAGE_QUEUE = "order_queue";
	
	@JmsListener(destination = MESSAGE_QUEUE)
	public void receiveMessage(ProductOrder order)
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Received " + order);
	}
	
}

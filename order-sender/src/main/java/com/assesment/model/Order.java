package com.assesment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Order {
    
	@Id
	@Column
	private int id;
	@Column
	private String item;
	@Column
	private long price;
	@Column
	private String state;
	@Column
	private long pin;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if(id <= 0 )
		{
			throw new IllegalStateException("id  value is negative/wrong");
		}
		this.id = id;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		if(item.isEmpty())
		{
			throw new NullPointerException("item value is null");
		}
		this.item = item;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		if(price < 0)
		{
			throw new IllegalStateException("price value is negative/wrong");
		}
		this.price = price;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		if(state.isEmpty())
		{
			throw new NullPointerException("state value is null");
		}
		this.state = state;
	}
	public long getPin() {
		return pin;
	}
	public void setPin(long pin) {
		if(price < 0)
		{
			throw new IllegalStateException("pin value is negative/wrong");
		}
		this.pin = pin;
	}
	
}

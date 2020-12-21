package com.client;

import java.util.ArrayList;
import java.util.List;




public class Books {
	
	private int bookid;
	private String bookname;
	
	private String author;
	
	private int price;
	
	private String publisher;
	
	
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) { 
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price < 0)
		{
			throw new IllegalStateException("price value is negative/wrong");
		}
		this.price = price;
	}
}

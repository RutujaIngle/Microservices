package com.javatpoint.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Books {
	@Id
	@Column
	private int bookid;
	@Column
	private String bookname;
	@Column
	private String author;
	@Column
	private int price;
	@Column 
	private String publisher;
	@Column
    @ElementCollection(targetClass = String.class)
	private List<String> distributors;
	public List<String> getDistributors() {
		return distributors;
	}
	public void setDistributors(List<String> distributors) {
		this.distributors = distributors;
	}
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

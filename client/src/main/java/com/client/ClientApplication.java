package com.client;

import java.awt.print.Book;
import java.util.List;

import javax.xml.ws.Response;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.util.JSONPObject;
//import com.javatpoint.model.Books;

//@SpringBootApplication
public class ClientApplication {

	public static void main(String[] args) {
		//SpringApplication.run(ClientApplication.class, args);
		/*RestTemplate restTemplate = new RestTemplate();
	    ResponseEntity<Books> books = restTemplate.getForEntity("http://localhost:8080/book/125", Books.class);
	    System.out.println(books.getBody().getAuthor());
	    System.out.println(books.getBody().getBookid());*/
		//deleteBook();
		//createBook();
		//updateBook();
		getAllBooks();
	}
	    
	    public static void createBook() {
	    	RestTemplate restTemplate = new RestTemplate();
	    	
	    	Books addbook = new Books();
	    	addbook.setBookid(124);
	    	addbook.setBookname("microservice");
	    	addbook.setAuthor("author1");
	    	addbook.setPublisher("publisher1");
	    	
	    	//HttpHeaders headers = new HttpHeaders();
	    	//headers.setContentType(MediaType.APPLICATION_JSON);
	    	
	    	
	    	String  response = restTemplate.postForObject("http://localhost:8080/books", addbook, String.class);
	    	System.out.println(response);
	    }
	    
	    public static void updateBook() {
	    	RestTemplate restTemplate = new RestTemplate();
	    	
	    	Books addbook = new Books();
	    	addbook.setBookid(120);
	    	addbook.setBookname("microservice");
	    	addbook.setAuthor("author1");
	    	addbook.setPublisher("publisher1");
	    	
	    	//HttpHeaders headers = new HttpHeaders();
	    	//headers.setContentType(MediaType.APPLICATION_JSON);
	    	
	    	
	    	restTemplate.put("http://localhost:8080/books", addbook);
	    	
	    }
	    
	    public static void deleteBook() {
	    	RestTemplate restTemplate = new RestTemplate();

	    	restTemplate.delete("http://localhost:8080/book/125");               
	    	System.out.println("deleted");
	    	
	    }
	    
	   public static void getAllBooks() {
		   Books book = new Books();
		   RestTemplate restTemplate = new RestTemplate();
		   
		   ResponseEntity<Books[]>  response =  restTemplate.getForEntity("http://localhost:8080/book", Books[].class);
		   Books[] books = response.getBody();
		   System.out.println(books[1]);
		    System.out.println(books[2].getBookid());
		    System.out.println(books[1].getBookid());
		    System.out.println(books[2].getBookid());
		   
		   
	   }
	    
	}
	



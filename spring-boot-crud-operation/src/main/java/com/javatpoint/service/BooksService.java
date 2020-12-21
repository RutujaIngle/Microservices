package com.javatpoint.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.javatpoint.SpringBootCrudOperationApplication;
import com.javatpoint.model.Books;
import com.javatpoint.repository.BooksRepository;

@Service
public class BooksService {
	final public Logger logger = LoggerFactory.getLogger(SpringBootCrudOperationApplication.class);
    @Autowired
	BooksRepository booksRepository;
	public List<Books> getAllBooks() {
		List<Books> books = new ArrayList<Books>();  
		booksRepository.findAll().forEach(books1 -> books.add(books1));  
		return books;  

	}

	public Books getBooksById(int bookid) {
		// TODO Auto-generated method stub
		return booksRepository.findById(bookid).get();  
	}

	public void delete(int bookid) {
		// TODO Auto-generated method stub
		booksRepository.deleteById(bookid);
		logger.info("book deleted");
	}
	

	public void  saveOrUpdateBook(Books books) {
		// TODO Auto-generated method stub
			booksRepository.save(books);
			logger.info("book saved/updated");
	
	}

	public List<Books> getBooksbyprice() {
		// TODO Auto-generated method stub
		booksRepository.findAll()
		return null;
	}

}

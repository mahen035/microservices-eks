package com.demo.bookservice.service;

import java.util.List;

import com.demo.bookservice.entity.Book;

public interface BookService {
	
	List<Book> getBooks();
	
	void addBook(Book book);

}

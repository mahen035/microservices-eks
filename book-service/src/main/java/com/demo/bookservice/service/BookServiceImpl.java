package com.demo.bookservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.bookservice.entity.Book;
import com.demo.bookservice.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	BookRepository bookRepository;

	@Override
	public List<Book> getBooks() {
		
		return bookRepository.findAll();
	}

	@Override
	public void addBook(Book book) {
		bookRepository.save(book);
		
	}

}

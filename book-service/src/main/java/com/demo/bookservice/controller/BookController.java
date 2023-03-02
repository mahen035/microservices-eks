package com.demo.bookservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.demo.bookservice.entity.Book;
import com.demo.bookservice.service.BookService;

@RestController
@RequestMapping("/api")
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@GetMapping("/book")
	public ResponseEntity<List<Book>> getBookList(){
		List<Book>books = bookService.getBooks();
		return new ResponseEntity<>(books, HttpStatus.OK);
	}
	
	@PostMapping("/book")
	public ResponseEntity<Book> addBook(@RequestBody Book book){
		bookService.addBook(book);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

}

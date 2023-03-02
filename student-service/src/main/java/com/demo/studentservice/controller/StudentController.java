package com.demo.studentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.studentservice.model.Book;
import com.demo.studentservice.service.BookAPIClient;

@Controller
@RequestMapping("/api")
public class StudentController {
	/*
	 * @Autowired RestTemplate restTemplate;
	 */
	@Autowired
	BookAPIClient apiClient;
	
	@RequestMapping(value = "/book", method = RequestMethod.GET)
	@ResponseBody
	public Book[] getBooks() {
		//ResponseEntity<Book[]> responseEntity = restTemplate.getForEntity("http://localhost:8283/api/book", Book[].class);
		//return responseEntity.getBody();
		Book[] bookList = apiClient.getBookList();
		return bookList;
	}

}

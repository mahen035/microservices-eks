package com.demo.studentservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.demo.studentservice.model.Book;

@FeignClient(name= "book-service")
public interface BookAPIClient {
	@GetMapping("/api/book")
	Book[] getBookList();

}

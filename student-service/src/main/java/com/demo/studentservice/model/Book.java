package com.demo.studentservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Book {
	
	private String bookId;
	private String bookName;
	private String author;
	private String publisher;

}

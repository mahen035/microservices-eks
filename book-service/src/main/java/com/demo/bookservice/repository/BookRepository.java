package com.demo.bookservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.bookservice.entity.Book;

public interface BookRepository extends JpaRepository<Book, String>{

}

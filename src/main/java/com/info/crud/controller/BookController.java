package com.info.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.info.crud.entity.Book;
import com.info.crud.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	public ResponseEntity<Book> createBook(@RequestBody Book b){
		Book createBook = bookService.createBook(b);
		return new ResponseEntity<Book>(createBook, HttpStatus.CREATED);
	}
}

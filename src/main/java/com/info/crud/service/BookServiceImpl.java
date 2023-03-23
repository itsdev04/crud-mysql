package com.info.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.info.crud.entity.Book;
import com.info.crud.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService{

	@Autowired(required=true)
	private BookRepository bookRepo;
	
	
	@Override
	public Book createBook(Book book) {
		Book b = bookRepo.save(book);
		return b;
	}

}

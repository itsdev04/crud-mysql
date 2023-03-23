package com.info.crud.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.info.crud.entity.Book;

public interface BookRepository extends JpaRepository<Book, Serializable>{

}

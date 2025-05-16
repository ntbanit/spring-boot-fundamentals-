package com.example.demo.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.book.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
	Book findByIsbn(String isbn);
}

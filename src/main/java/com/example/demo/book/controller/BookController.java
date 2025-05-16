package com.example.demo.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.book.entity.Book;
import com.example.demo.book.repository.BookRepository;


@Controller
public class BookController {

	@Autowired
	private BookRepository bookRepository;

	@GetMapping("/")
	public String getBooks(Model model) throws Exception {
		List<Book> bookList = bookRepository.findAll();
		model.addAttribute("books", bookList);
		return "books";
	}
	
	@GetMapping("/book/new")
	public String showCreateForm(Model model) {
		model.addAttribute("book", new Book());
		return "create_book" ;
	}
	
	@PostMapping("/books")
	public String saveBook(Book book) {
		bookRepository.save(book);
		return "redirect:/";
	}
	
}

package com.nagarro.springApi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.springApi.model.BookModel;
import com.nagarro.springApi.service.BookService;

/*book controller to handle the http request*/
@RestController
public class BookController {
	
	@Autowired
	private BookService bs;
	
	/*get books will return the list of all book object*/
	@GetMapping("/getbooks")
	public List<BookModel> fetchbooks() {
		return bs.getBooks();
	}
	
	/*fetch book return a specific book object that is matching with book id*/
	@GetMapping("/getbook/{id}")
	public Optional<BookModel> fetchbook(@PathVariable("id") long code) {
		System.out.println("=================>>>"+code);
		return bs.getBook(code);
	}
	
	/*it will delete the book object*/
	@GetMapping("/deletebook/{id}")
	public Optional<BookModel> deleteBook(@PathVariable("id") long code){
		System.out.println("delete===============>");
		return bs.deleteBook(code);
	}
	
	/*it will insert the book details in database*/
	@PostMapping("/addbook")
	public BookModel insertBook(@RequestBody BookModel book) {
		return bs.addBook(book);
	}
	
}

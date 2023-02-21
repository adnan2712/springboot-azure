package com.nagarro.springApi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.springApi.dao.BookDao;
import com.nagarro.springApi.model.BookModel;

@Service
public class BookService {
	@Autowired
	private BookDao bookDao;

	public List<BookModel> getBooks() {
		return bookDao.findAll();
	}

	public Optional<BookModel> getBook(long bookCode) {
		return bookDao.findById(bookCode);
	}

	public BookModel addBook(BookModel book) {
		bookDao.save(book);
		return book;
	}
	
	public BookModel updateBook(BookModel book) {
		bookDao.save(book);
		return book;
	}
	
	public Optional<BookModel> deleteBook(long bookCode) {
		Optional<BookModel> book=bookDao.findById(bookCode);
		if(book!=null) {
			bookDao.deleteById(bookCode);
		}
		return book;
	}

}

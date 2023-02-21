package com.nagarro.springApi.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BookModel {
	@Id
	private long bookCode;
	private String bookName;
	private String author;
	private Date dataAdded = new Date();

	@Override
	public String toString() {
		return "BookModel [bookCode=" + bookCode + ", bookName=" + bookName + ", author=" + author + ", dataAdded="
				+ dataAdded + "]";
	}

	public long getBookCode() {
		return bookCode;
	}

	public void setBookCode(long bookCode) {
		this.bookCode = bookCode;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getDataAdded() {
		return dataAdded;
	}

	public void setDataAdded(Date dataAdded) {
		this.dataAdded = dataAdded;
	}

	public BookModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookModel(long bookCode, String bookName, String author, Date dataAdded) {
		super();
		this.bookCode = bookCode;
		this.bookName = bookName;
		this.author = author;
		this.dataAdded = dataAdded;
	}


}

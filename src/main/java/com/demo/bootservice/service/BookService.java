package com.demo.bootservice.service;

import java.util.List;

import com.demo.bootservice.model.Book;

public interface BookService {

//	Get All Book
	public List<Book> getAllBook();
	
//	Add New Book
	public Book addBook(Book book);
	
//	Delete Book
	public void deleteBook(int id);
	
//	update Book
	public Book updateBook(int id, Book book);
	
//	Get Book By Id
	public Book getBookById(int id);
	
}

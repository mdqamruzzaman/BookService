package com.demo.bootservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.bootservice.exception.BookDetailsNotFound;
import com.demo.bootservice.model.Book;
import com.demo.bootservice.reposiotry.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookrepo;

//	Get All Book List
	@Override
	public List<Book> getAllBook() {
		return bookrepo.findAll();
	}

//	Add Book Details
	@Override
	public Book addBook(Book book) {
		return bookrepo.save(book);
	}

//	Delete Book Details
	@Override
	public void deleteBook(int id) {
		Optional<Book> getBook = bookrepo.findById(id);
		if (getBook.isPresent()) {
			bookrepo.delete(getBook.get());
		} else {
			throw new BookDetailsNotFound("Book Not Found in the Database");
		}
	}

//	Update Book Details
	@Override
	public Book updateBook(int id, Book book) {
		Optional<Book> getBook = bookrepo.findById(id);
		if (getBook.isPresent()) {
			return bookrepo.save(book);
		} else {
			throw new BookDetailsNotFound("Book Details is not Updated because id is not found");

		}

	}

//	Get Book Details by Id
	@Override
	public Book getBookById(int id) {
		Optional<Book> getBook = bookrepo.findById(id);
		if (getBook.isPresent()) {
			return getBook.get();
		} else {
			throw new BookDetailsNotFound("Book Not Found in the Database");
		}
	}

}

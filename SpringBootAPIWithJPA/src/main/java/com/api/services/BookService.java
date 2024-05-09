package com.api.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.dao.BookRepository;
import com.api.entities.Book;

@Component
public class BookService {

	@Autowired
	private BookRepository bookRepository;
	
	
	// return all books
	public List<Book> getAllBooks(){
	
		List<Book> list = (List<Book>)bookRepository.findAll();
		return list;
	
	}
	
	// return all books
	public Book getBookById(int id){
		
		return bookRepository.findById(id) ;

		
	}
	
	// add a book
	public Book addBookInService(Book b){
		Book result = bookRepository.save(b);
		return result;
			
	}
	
	// delete all books
	public void deleteBookInService(){
		bookRepository.deleteAll();
				
	}
	
	// update book by id
	public void updateBookByIdInService(Book inputBook, int id){
		inputBook.setId(id);
		bookRepository.save(inputBook);
	}
	
	
	
	
	
	
}

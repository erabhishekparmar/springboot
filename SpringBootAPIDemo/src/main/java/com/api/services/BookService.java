package com.api.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.api.entities.Book;

@Component
public class BookService {

	private static List<Book> list = new ArrayList<>();
	
	static {
	    
		
		
		  list.add(new Book(1,"First Step","Abhishek")); list.add(new
		  Book(2,"Second Step","Dheerendra")); list.add(new
		  Book(3,"10 Rules of Life","Chetan"));
		 
		 
	}
	
	// return all books
	public List<Book> getAllBooks(){
		return list;
	}
	
	// return all books
	public Book getBookById(int id){
		
		Book b = null;
		
		try {
			b=list.stream().filter(e->e.getId()==id).findFirst().get();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return b;
		
	}
	
	// add a book
	public Book addBookInService(Book b){
		list.add(b);
		return b;
			
	}
	
	// delete all books
	public void deleteBookInService(){
		list=null;
				
	}
	
	// delete book by id
	public Book deleteBookByIDInService(int id){
		Book b = list.stream().filter(book->book.getId()==id).findFirst().get();
		list.remove(b);
		
		// or 
		//list = list.stream().filter(book->book.getId()!=id).collect(Collectors.toList());
		
		return b;
	}
	
	
	// update book by id
	public void updateBookByIdInService(Book inputBook, int id){
		
		
		list = list.stream().map(book->{
			if(book.getId()==id) {
				book.setAuthor(inputBook.getAuthor());
				book.setTitle(inputBook.getTitle());
			}
			return book;
		}).collect(Collectors.toList());
		
		
		 // in case if I have to return the book as well
		/*
		 * for(Book book : list) { if(book.getId()==id) {
		 * book.setTitle(inputBook.getTitle()); book.setAuthor(inputBook.getAuthor());
		 * return book; } }
		*return null;
		* */

	}
	
	
	
	
	
	
}

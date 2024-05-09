package com.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.entities.Book;
import com.api.services.BookService;

@RestController
//@Controller
public class BookController {
	
	@Autowired
	private BookService bookService;

	/*
	 * @GetMapping("/books") public List<Book> gestBooks() {
	 * 
	 * return bookService.getAllBooks();
	 *
	 * }
	 */
	
	
	@GetMapping("/books")
	public ResponseEntity<List<Book>> gestBooks() {
		
		
		List<Book> list= bookService.getAllBooks();
		
		
		System.out.println(list.size());
		if(list.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		 
		return ResponseEntity.of(Optional.of(list));
		 
	}
	
	
	/*
	 * @GetMapping("/books/{id}") public Book
	 * gestBooksByID(@PathVariable("id") int id) {
	 * 
	 * return bookService.getBookById(id);
	 * 
	 * }
	 */
	
	@GetMapping("/books/{id}")
	public ResponseEntity<Book> gestBooksByID(@PathVariable("id") int id) {
		
		Book book = bookService.getBookById(id);
		
		if(book==null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
		return ResponseEntity.of(Optional.of(book));
		 
	}
	
	@PostMapping("/books")
	public Book addBook(@RequestBody Book book) {
		
		bookService.addBookInService(book);
		System.out.println(book);
		return book;
		
	}
	
	/*
	 * @DeleteMapping("/deletebooks") public void deleteBooks() {
	 * 
	 * bookService.deleteBookInService();
	 * 
	 * }
	 */
	
	
	@DeleteMapping("/deletebooks")
	public ResponseEntity<Void> deleteBooks() {
		
		try {
			bookService.deleteBookInService();
			return ResponseEntity.ok().build();
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
		
	}
	
	/*
	 * @DeleteMapping("/delete/{id}") public Book deleteBookById(@PathVariable("id")
	 * int id) {
	 * 
	 * Book book= bookService.deleteBookByIDInService(id); return book; }
	 */
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Book> deleteBookById(@PathVariable("id") int id) {
		
		Book book = null;
				
		try{
			book = bookService.deleteBookByIDInService(id);
			return ResponseEntity.ok().body(book);
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}
	
	
	
	@PutMapping("/books/{id}")
	public Book updateBookById(@RequestBody Book book, @PathVariable("id") int id) {
		
		 bookService.updateBookByIdInService(book,id);
		 return book;
			/*
			 * Book updatedBook= bookService.updateBookByIdInService(book,id); return
			 * updatedBook;
			 */
	}
	
	/*
	 * @RequestMapping(value="/books" , method = RequestMethod.GET)
	 * 
	 * @ResponseBody public Book getBooks() {
	 * 
	 * Book book = new Book(); book.setId(1); book.setTitle("First Step");
	 * book.setAuthor("Abhishek");
	 * 
	 * return book; // spring boot convert object into json }
	 */
	
	
}

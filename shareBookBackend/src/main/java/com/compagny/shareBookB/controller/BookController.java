package com.compagny.shareBookB.controller;

import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.compagny.shareBookB.model.Book;
import com.compagny.shareBookB.model.User;

@RestController
public class BookController {
	
	@GetMapping("/books/booK")
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void deleteBook(@PathVariable("bookId") String bookId) {
		
	}
	
	@PostMapping("/users/{userId}/books")
	@ResponseStatus(value = HttpStatus.CREATED)
	public Book createBookByUser(@PathVariable("userId") String userId,@Valid @RequestBody Book book) {

		return book ;
	}
	
	@GetMapping("/users/{userId}/books")
	public List<Book> getMyBooks(@PathVariable("userId") String userId, @RequestBody Book book) {
		
		return Arrays.asList(book);
	}
	
	@GetMapping("/users/{userId}/books/status/{status}")
	public List<Book> getBookByStatus(@PathVariable("userId") String userId, @PathVariable("status") String status) {
		
		Book book = new Book();

		book.setName("Steve JOBS");
	
		
		return Arrays.asList(book);
	}

}

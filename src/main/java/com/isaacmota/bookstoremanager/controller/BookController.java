package com.isaacmota.bookstoremanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isaacmota.bookstoremanager.dto.MessageResponseDTO;
import com.isaacmota.bookstoremanager.entity.Book;
import com.isaacmota.bookstoremanager.repository.BookRepository;

@RestController
@RequestMapping("/api/v1/book")
public class BookController {
	
	private BookRepository bookRepository;
	
	@Autowired
	public BookController(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	@PostMapping
	public MessageResponseDTO create(@RequestBody Book book) {
	    Book savedBook = bookRepository.save(book);
	    return MessageResponseDTO.builder().message("Book created with ID: " + savedBook.getId()).build();
	}

	
	
	
}

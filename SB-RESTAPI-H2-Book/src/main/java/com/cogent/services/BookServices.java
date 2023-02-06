package com.cogent.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.entity.Book;
import com.cogent.repository.BookRepository;

@Service
public class BookServices {

	@Autowired
	BookRepository br;
	
	public List<Book> getAll(){
		return (List<Book>) br.findAll();	
	}
	
	public Book update(Book b) {
		return br.save(b);
	}
	
	public void delete(Book b) {
		br.delete(b);
	}
	
	public Optional<Book> get(int id){
		return br.findById(id);
	}
	
}

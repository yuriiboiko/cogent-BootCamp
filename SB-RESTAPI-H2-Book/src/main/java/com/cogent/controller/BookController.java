package com.cogent.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cogent.entity.Book;
import com.cogent.services.BookServices;


@Controller
@ResponseBody

@RequestMapping("/api")
public class BookController {
	@Autowired
	BookServices bs;
	
	@GetMapping("/book")
	public List<Book> getAll(){
		List<Book> list = bs.getAll();
		System.out.println("Retrived "+ list.size()+ " books");
		return list;
	}
	
	@PostMapping("/book")
	public Book add(@RequestBody Book b) {
		return bs.update(b);
	}
	
	@PutMapping("/book")
	public Book update(@RequestBody Book b) {
		return bs.update(b);
	}
	
	@DeleteMapping("/book")
	public String delete(@RequestParam(value="id") Integer id) {
		Optional<Book> list =bs.get(id);
		bs.delete(list.get());
		return "Book id "+ id + " deleted successfully";
	}

}

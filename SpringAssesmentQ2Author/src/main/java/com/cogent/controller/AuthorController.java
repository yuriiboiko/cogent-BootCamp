package com.cogent.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.entity.Author;
import com.cogent.service.AuthorServices;

@RestController
public class AuthorController {
	@Autowired
	AuthorServices as;
	
	//handles the read command and returns all the rows of the Author Table 
	@GetMapping("/read")
	public List<Author> read(){
		List<Author> list= as.getAll();
		System.out.println("Retrived "+ list.size()+ " author");
		return list;
		
	}
	
	//inserts a new Author object in the H2 database
	@PostMapping("/create")
	public Author create(@RequestBody Author a) {
		System.out.println("Added author");
		return as.save(a);
	}
	
	//Updates an existing Author if the id match if it doesn't than it inserts a new author
	@PutMapping("/update")
	public Author update(@RequestBody Author a) {
		int id= a.getAuthorId();
		Optional<Author> list = as.getId(id);
		if(list.isEmpty()) {
			System.out.println("No author found...");
			System.out.println("Inserting author with id: " +id);
		}else {
			System.out.println("Updating author with id: "+id);

		}

		return as.save(a);
	}
	
	
	//deletes the author from the Author table given the Authors id
	@DeleteMapping("/delete")
	public void delete(@RequestParam(value="id") Integer id) {
		Optional<Author> list = as.getId(id);
		as.delete(list.get());
		System.out.println("Author with id "+ id+ " deleted");
	}
	
	
	
	
}

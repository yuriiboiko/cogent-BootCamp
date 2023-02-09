package com.cogent.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.entity.Author;
import com.cogent.repository.AuthorRepository;

@Service
public class AuthorServices {
	@Autowired
	AuthorRepository ar;
	
	public List<Author> getAll(){
		return (List<Author>) ar.findAll();
	}
	
	public Author save(Author a) {
		return ar.save(a);
	}
	
	public void delete(Author e) {
		ar.delete(e);
	}
	
	public Optional<Author> getId(int id){
		
		return ar.findById(id);
	}
	
	
}

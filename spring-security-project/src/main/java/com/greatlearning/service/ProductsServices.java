package com.greatlearning.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.entity.Product;
import com.greatlearning.repository.ProductRepository;


@Service
public class ProductsServices {

	@Autowired
	ProductRepository pr;
	
	public List<Product> getAll(){
		return (List<Product>) pr.findAll();	
	}
	
	public Product update(Product p) {
		return pr.save(p);
	}
	
	public void delete(Product p) {
		pr.delete(p);
	}
	
	public Optional<Product> get(int id){
		return pr.findById(id);
	}
	
}

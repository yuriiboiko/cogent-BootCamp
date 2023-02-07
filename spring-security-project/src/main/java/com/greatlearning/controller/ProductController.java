package com.greatlearning.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.greatlearning.entity.Product;
import com.greatlearning.service.ProductsServices;

@RestController
public class ProductController {
	@Autowired
	ProductsServices ps;
	
	@GetMapping("/product")
	public List<Product> getAll(){
		List<Product> list = ps.getAll();
		System.out.println("Retrived "+ list.size()+ " product");
		return list;
	}
	
	
	@PostMapping("/product")
	public Product add(@RequestBody Product p) 
	{
		System.out.println("Added a product");
		return ps.update(p);
	}
	
	@PutMapping("/product")
	public Product update(@RequestBody Product p) {
		System.out.println("Updating product");
		return ps.update(p);
	}
	
	
	@DeleteMapping("/product")
	public String delete(@RequestParam(value="id") Integer id) {
		Optional<Product> list =ps.get(id);
		ps.delete(list.get());
		return "Product id "+ id + " deleted successfully";
	}

	

}

package com.cogent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.entity.Product;
import com.cogent.services.ProductServices;

@RestController
public class ProductController {

	@Autowired
	private ProductServices ps;
	
	@GetMapping("/product")
	public List<Product> fetchProduct(){
		return ps.fetchProduct();
	}
	
	@PostMapping("/product")
	public Product saveProduct(@Validated @RequestBody Product p) {
		return ps.saveProduct(p);
	}
	
}

package com.cogent.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.entity.Product;
import com.cogent.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductServices {
	
	@Autowired
	ProductRepository pr;
	
	@Override
	public Product saveProduct(Product p) {

		return pr.save(p);
	}

	@Override
	public List<Product> fetchProduct() {
		return (List<Product>) pr.findAll();
	}

}

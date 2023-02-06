package com.cogent.services;

import java.util.List;

import com.cogent.entity.Product;

public interface ProductServices {
	
	Product saveProduct(Product p);
	List<Product> fetchProduct();

}

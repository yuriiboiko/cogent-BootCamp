package com.cogent.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cogent.entity.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product,Long>  {
	
	

}

package com.cogent.repository;

import org.springframework.data.repository.CrudRepository;
import com.cogent.entity.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {
	

}

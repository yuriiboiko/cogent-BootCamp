package com.cogent.dao;

public interface ProductDAO {
	
	void creat();
	void print();
	void change(int pid);
	void deleteId(int pid);
	void deleteCat(String pCat);
	void findId(int pid);
	void findCat(String pCat);
	
	
}

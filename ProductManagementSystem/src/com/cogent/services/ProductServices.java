package com.cogent.services;

import com.cogent.dao.ProductDAOImpl;

public class ProductServices {

	private ProductDAOImpl dao;
	
	public ProductServices() {
		super();
		this.dao= new ProductDAOImpl();
	}
	
	public void save() {
		dao.creat();
	}
	
	public void fetch() {
		dao.print();
	}
	
	public void update(int pid) {
		dao.change(pid);
	}
	
	public void removeById(int pid) {
		dao.deleteId(pid);
	}
	
	public void removeByCat(String pCat) {
		dao.deleteCat(pCat);
	}
	
	public void search(int pid) {
		dao.findId(pid);
	}
	
	public void search(String pCat) {
		dao.findCat(pCat);
	}
	
	
}

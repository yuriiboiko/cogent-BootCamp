package com.cogent.services;

import com.cogent.dao.CustomerDAOImpl;

public class CustomerService {

	private CustomerDAOImpl dao;

	public CustomerService() {
		super();
		this.dao= new CustomerDAOImpl();
	}
	
	public void save() {
		dao.creat();
	}
	
	public void fetch() {
		if(!dao.isEmpty()) {
			dao.read();
		}
		else {
			System.out.println("Empty Record!");
		}
	}
	
	public void modify(String cId) {
		if(!dao.isEmpty()) {
			dao.update(cId);
		}else {
			System.out.println("Empty Record!");
		}
	}
	
	public void remove(String cId) {
		dao.delete(cId);
	}
	
	public void search(String cId) {
		dao.findCustomerById(cId);
	}
	
	public void findYoungest() {
		dao.findYoundgestCustomer();
	}
	
}

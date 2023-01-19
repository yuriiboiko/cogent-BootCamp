package com.cogent.dao;

public interface CustomerDAO {
	
	void creat();
	void read();
	void update(String customerID);
	void delete(String customerID);
	void findCustomerById(String customerID);
	void findYoundgestCustomer();

}

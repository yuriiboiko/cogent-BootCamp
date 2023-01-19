package com.cogent.dao;

import java.util.Scanner;

import com.cogent.exception.MandatoryFieldException;
import com.cogent.model.Customer;
import com.cogent.model.Date;

public class CustomerDAOImpl implements CustomerDAO {
	private Customer customers[];
	Scanner sc = new Scanner(System.in);

	@Override
	public void creat() {

		if(customers==null) {
			creatHelper();
		}else {

			addCustomer();
		}

	}
	
	private void creatHelper() {
		System.out.println("How many customers do you want to store?");
		int size = sc.nextInt();
		customers = new Customer[size];
		for (int i = 0; i < customers.length; i++) {
			Customer cust = createCustomer();
			customers[i]=cust;
		} 
	}
	
	
	private void addCustomer() {
		
		System.out.println("Record exists.");
		read();
		System.out.println("Adding a new customer to the record...");
		int size = customers.length;
		Customer newCustomers[]= new Customer[size+1];
		System.arraycopy(customers, 0, newCustomers,0,size);
		customers=newCustomers;
		customers[size]=createCustomer();
		
	}
	
	private Customer createCustomer() {
		
		Customer cust =new Customer();
		System.out.println("Please enter customer ID.");
		String cid =sc.next();
		System.out.println("Please enter customer name.");
		String cname =sc.next();
		System.out.println("Please enter customer email.");
		String email =sc.next();
		System.out.println("Please enter customer birthday.");
		System.out.println("Day");
		int d =sc.nextInt();
		System.out.println("Mounth");
		int m =sc.nextInt();
		System.out.println("Year");
		int y =sc.nextInt();
		Date dob= new Date(d,m,y);
		cust.setcName(cname);
		cust.setcDob(dob);
		cust.setcEmail(email);
		cust.setcId(cid);
		
		validateMandatoryFiled(dob);
		validateMandatoryFiled(cust);
	
		return cust;
	}
	
	public void validateMandatoryFiled(Customer cust) {
		if(cust==null) {
			throw new MandatoryFieldException("Customer object cannot be blank");
		}else if(cust.getcId()==null) {
			throw new MandatoryFieldException("Customer id cannot be blank");
		}
		else if(cust.getcEmail()==null) {
			throw new MandatoryFieldException("Customer email cannot be blank");
		}
		
		validateMandatoryFiled(cust.getcDob());
		
	}
	
	public void validateMandatoryFiled(Date d) {
		//to do validate the date of birth
		
	}
	
	@Override
	public void read() {
		System.out.println("Customers Information");
		for (int i = 0; i < customers.length; i++) {
			this.customers[i].printCustomer();
		}
	}


	@Override
	public void update(String customerID) {
		for (int i = 0; i < customers.length; i++) {
			if(customerID.equals(this.customers[i].getcId())) {
				System.out.println("Customer Id found!\nHeres their following information...");
				this.customers[i].printCustomer();
				updateHelper(i);
				System.out.println("Update successful!");
				System.out.println("Here is the new Customer information...");
				this.customers[i].printCustomer();
				return;
			}
			
		}
		System.out.println("Update unsuccessful!");
		System.out.println("Customer Id could not be found!");
		
	}

	private void updateHelper(int index) {
		System.out.println("Please enter new customer ID.");
		String cid =sc.next();
		System.out.println("Please enter new customer name.");
		String cname =sc.next();
		System.out.println("Please enter new customer email.");
		String email =sc.next();
		System.out.println("Please enter new customer birthday.");
		System.out.println("Day");
		int d =sc.nextInt();
		System.out.println("Mounth");
		int m =sc.nextInt();
		System.out.println("Year");
		int y =sc.nextInt();
		
		Date dob = new Date(d,m,y);
		validateMandatoryFiled(dob);

		Customer cust = new Customer();
		cust.setcId(cid);
		cust.setcName(cname);
		cust.setcDob(dob);
		cust.setcEmail(email);
		validateMandatoryFiled(cust);
					
		customers[index]=cust;
		
	}
	
	
	@Override
	public void delete(String customerID) {
		int index=findCustomerByIdHelper(customerID);
		if(index==-1) {
			System.out.println("Delete customer failed!");
			return;
		}
		
		System.out.println("This Customer will be deleted...");		
		customers=deleteHelper(index);
		System.out.println("Deleted customer successful!");

	}

	
	private Customer[] deleteHelper(int index) {
		
		if(customers.length==1) {
			return null;
		}
		int size = customers.length;
		Customer newCustomers[]= new Customer[size-1];
		for (int i = 0, j=0; i < customers.length; i++) {
			if(index!=i) {
				newCustomers[j]=customers[i];
				j++;
			}
		}
		
		
		return newCustomers;
	}
	
	
	@Override
	public void findCustomerById(String customerID) {
		findCustomerByIdHelper(customerID);
	}
	
	
	/*
	 * findCustomerByIdHelper: iterates through customers array and looks for a Customer object
	 * that matches the customerID that was passed into the function.
	 * Returns an integer index value to the element in the customers array 
	 * or returns -1 if customerID is not found in the array 
	 */
	private int findCustomerByIdHelper(String customerID) {
		for (int i = 0; i < customers.length; i++) {
			if(customerID.equals(this.customers[i].getcId())) {
				System.out.println("Customer Id found!\nHere is their following information...");
				this.customers[i].printCustomer();
				return i;
			}
		}
		System.out.println("Couldn't find customer with id: " +customerID);
		return -1;

	}

	@Override
	public void findYoundgestCustomer() {
		if(customers==null) {
			System.out.println("Empty record");
		}else if(customers.length==1) {
			System.out.println("Youngest customer found");
			customers[0].printCustomer();
		}else {
			
			findYoundgestCustomerHelper();
		}
	}
	
	private Customer findYoundgestCustomerHelper() {
		Customer youngest = new Customer();
		youngest = customers[0];
		for (int i = 1; i < customers.length; i++) {
			if(customers[i].isYounger(youngest)) {
				youngest=customers[i];
			}	
		}
		youngest.printCustomer();
		return youngest;
	}
	
	
	public boolean isEmpty() {
		if(customers==null) {
			return true;
		}
		return false;
	}
}

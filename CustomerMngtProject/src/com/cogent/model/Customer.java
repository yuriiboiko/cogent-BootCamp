package com.cogent.model;

public class Customer {
	private String cId;
	private String cName;
	private String cEmail;
	private Date cDob;
	
	public Customer(String cId, String cName, String cEmail, Date cDob) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cEmail = cEmail;
		this.cDob = new Date();
	}

	public Customer() {
		super();

	}

	public String getcId() {
		return cId;
	}

	public void setcId(String cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcEmail() {
		return cEmail;
	}

	public void setcEmail(String cEmail) {
		this.cEmail = cEmail;
	}

	public Date getcDob() {
		return cDob;
	}

	public void setcDob(Date cDob) {
		this.cDob = cDob;
	}
	
	public void printCustomer() {
		System.out.println("--------------------------------------------");
		System.out.println("Customer Id is: "+ this.cId );
		System.out.println("Customer Name is: "+ this.cName );
		System.out.println("Customer Email is: "+ this.cEmail);
		System.out.print("Customer Date of Birth is: ");
		this.cDob.printDate();
		System.out.println("--------------------------------------------");
	}
	
	public boolean isYounger(Customer customer) {
		if(cDob.isGreaterThan(customer.getcDob())) {
			return true;
		}
		return false;
	}
	

}

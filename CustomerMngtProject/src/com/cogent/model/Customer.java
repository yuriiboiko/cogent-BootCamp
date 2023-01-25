package com.cogent.model;

import com.cogent.exception.MandatoryFieldException;

public class Customer {

	private String cId;
	private String cName;
	private String cEmail;
	private Date cDob;

	public Customer(String cId, String cName, String cEmail, Date cDob) {
		super();
		setcId(cId);
		setcName(cName);
		setcEmail(cEmail);
		setcDob(cDob);
	}

	public Customer() {
		super();
		this.cId="999";
		this.cName="Yurii";
		this.cEmail="default@mail.com";
		this.cDob= new Date();		

	}

	public String getcId() {
		return cId;
	}

	public void setcId(String cId) {


		try {
			if(cId==null) {
				throw new MandatoryFieldException("Customer id cannot be blank. Set to default value");
			}
			this.cId = cId;		
		}catch(MandatoryFieldException mfe) {
				System.out.println(mfe.getMessage());
				this.setcId("999");
		}

	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {


		try {

			if(cName==null) {
				throw new MandatoryFieldException("Customer id cannot be blank. Set to default value");
			}
			this.cName = cName;
		}catch(MandatoryFieldException mfe) {
			System.out.println(mfe.getMessage());
			this.setcName("Yurii");
		}


	}

	public String getcEmail() {
		return cEmail;
	}

	public void setcEmail(String cEmail) {

		try {
			if(cEmail==null) {
				throw new MandatoryFieldException("Customer email cannot be blank. Set to default value");
			}
			this.cEmail = cEmail;		
		}catch(MandatoryFieldException mfe) {
			System.out.println(mfe.getMessage());
			this.setcEmail("default@emal.com");
		}

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

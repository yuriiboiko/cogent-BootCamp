package com.cogent;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
	private int pId;
	private String pName;
	private int pAge;
	
	@Autowired
	private Country cntr;

	public Person() {
		super();
	}



	public Person(int pId, String pName, int pAge,  Country cntr) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pAge = pAge;
		this.cntr =cntr;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getpAge() {
		return pAge;
	}

	public void setpAge(int pAge) {
		this.pAge = pAge;
	}

	public void showPerson() {
		System.out.println(toString());
	}




	@Override
	public String toString() {
		return "Person [pId=" + pId + ", pName=" + pName + ", pAge=" + pAge + "," + cntr.toString() +" ]";
	}



	public Country getCntr() {
		return cntr;
	}

	public void setCntr(Country cntr) {
		this.cntr = cntr;
	}


}

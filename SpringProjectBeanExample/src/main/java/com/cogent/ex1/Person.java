package com.cogent.ex1;

public class Person {
	private int pId;
	private String pName;
	private int pAge;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Person(int pId, String pName, int pAge) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pAge = pAge;
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

	@Override
	public String toString() {
		return "pId=" + pId + ", pName=" + pName + ", pAge=" + pAge ;
	}
	
	
}

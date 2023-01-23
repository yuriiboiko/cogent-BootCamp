package com.cogent.day1.q5;

public class Employee {

	private int eNum;
	private String eName;
	private Date joinDate;
	
	
	
	public Employee(int eNum, String eName, Date joinDate) {
		super();
		this.eNum = eNum;
		this.eName = eName;
		this.joinDate = joinDate;


	}
	
	
	public int geteNum() {
		return eNum;
	}
	public void seteNum(int eNum) {
		this.eNum = eNum;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate (Date joinDate) {
		try {
			this.joinDate = joinDate;

		}catch(IllegalArgumentException iae) {
			
			System.out.println(iae.getMessage());
			this.joinDate= new Date(5,4,1995);
			
		}
		
	}


	@Override
	public String toString() {
		return "Employee [eNum=" + eNum + ", eName=" + eName + ", joinDate=" + joinDate + "]";
	}
	
	
	
}

package com.greatlearning.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Contacts")
public class EmployeeContact {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private long phoneNumber;
	
	
	
	public EmployeeContact(int id, long phoneNumber) {
		super();
		this.id = id;
		this.phoneNumber = phoneNumber;
	}
	
	public EmployeeContact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	
	
}

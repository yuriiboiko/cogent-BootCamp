package com.cogent.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long pNo;
	private String pName;
	private double pPrice;
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Product(long pNo, String pName, double pPrice) {
		super();
		this.pNo = pNo;
		this.pName = pName;
		this.pPrice = pPrice;
	}
	
	public long getpNo() {
		return pNo;
	}
	public void setpNo(long pNo) {
		this.pNo = pNo;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public double getpPrice() {
		return pPrice;
	}
	public void setpPrice(double pPrice) {
		this.pPrice = pPrice;
	}
	
	
	
	
	
}

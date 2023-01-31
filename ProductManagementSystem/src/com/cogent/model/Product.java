package com.cogent.model;

import java.sql.Date;

import com.cogent.exception.MandatoryFieldException;

public class Product {

	private int pid;
	private String pname;
	private String pcat;
	private Date manufactureDate;
	private double price;
	private Date expityDate;




	public Product() {
		super();
		this.pid = 0001;
		this.pname = "Default";
		this.pcat = "Default";
		this.manufactureDate = new Date(1995, 5, 4);
		this.price = 0.0;
		this.expityDate = new Date(1995, 5, 4);
	}

	public Product(int pid, String pname, String pcat, Date manufactureDate, double price, Date expityDate) {
		super();
		setPid(pid);
		setPname(pname);
		setPcat(pcat);
		setManufactureDate(manufactureDate);
		setPrice(price);
		setExpityDate(expityDate);
	}

	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		try {
			if(pid<=0) {
				throw new MandatoryFieldException("Product id must be positive number. Set to default value 0001");
			}
			this.pid = pid;
		}catch(MandatoryFieldException mfe) {
			System.out.println(mfe.getMessage());
			this.pid=0001;
		}

	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		try {

			if(pname==null) {
				throw new MandatoryFieldException("Product name cannot be blank. Set to default value");
			}
			this.pname = pname;
		}catch(MandatoryFieldException mfe) {
			System.out.println(mfe.getMessage());
			this.setPname("Default");
		}
	}
	public String getPcat() {
		return pcat;
	}
	public void setPcat(String pcat) {
		try {

			if(pcat==null) {
				throw new MandatoryFieldException("Product category cannot be blank. Set to default value");
			}
			this.pcat = pcat;
		}catch(MandatoryFieldException mfe) {
			System.out.println(mfe.getMessage());
			this.setPcat("Default");
		}
	}
	public Date getManufactureDate() {
		return manufactureDate;
	}
	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		try {
			if(price<0) {
				throw new MandatoryFieldException("Product price must be positive number. Set to default value 0.0");
			}
			this.price = price;
		}catch(MandatoryFieldException mfe) {
			System.out.println(mfe.getMessage());
			this.price=0.0;
		}

	}
	public Date getExpityDate() {
		
		
		return expityDate;
	}
	public void setExpityDate(Date expityDate) {
		this.expityDate = expityDate;
	}

	@Override
	public String toString() {
		return "[pid=" + pid + ", pname=" + pname + ", pcat=" + pcat + ", manufactureDate=" + manufactureDate
				+ ", price=" + price + ", expityDate=" + expityDate + "]";
	}



}

package com.cogent.day10;

public class Book{
	String title;
	String auther;
	int pages;
	double price;
	public Book(String title, String auther, int pages, double price) {
		super();
		this.title = title;
		this.auther = auther;
		this.pages = pages;
		this.price = price;
	}

	public String toString() {
		return "Title: "+ title +", Auther: "+ auther + ", Pages: "+ pages + ", Price: " + price;
	}

	public boolean equals(Object obj) {
		if(obj instanceof Book) {
			Book b = (Book) obj;
			if((0==title.compareTo(b.title))&(0==auther.compareTo(b.auther))& pages==b.pages & price==b.price ) {
				return true;
			}else {
				return false;
			}

		}else {
			return false;

		}
	}
}
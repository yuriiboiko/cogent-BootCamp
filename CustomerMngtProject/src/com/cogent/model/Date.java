package com.cogent.model;


public class Date {

	private int year;
	private int month;
	private int day;


	public Date( int day, int month, int year) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public Date() {
		super();
		this.year = 0;
		this.month = 0;
		this.day = 0;
	}

	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}

	public void printDate() {
		System.out.printf("%d-%d-%d\n",this.day, this.month, this.year );
	}

	public boolean isEqualTo(Date d) {
		if(d.getYear()!=this.year) {
			return false;
		}else if(d.getMonth()!= this.month) {
			return false;
		}else if(d.getDay() != this.day) {
			return false;
		}
		return true;
	}


	public boolean isGreaterThan(Date d) {
		if(d.getYear() != this.year) {
			if(this.year > d.getYear()) {
				return true;
			}
			return false;
		}else if(d.getMonth() != this.month) {
			if(this.month > d.getMonth()) {
				return true;
			}
			return false;
		}else if(d.getDay() != this.day) {
			if(this.day > d.getDay()) {
				return true;
			}
			return false;
		}
		return false;

	}


	public boolean isLessThan(Date d) {

		if(d.getYear() != this.year) {
			if(this.year < d.getYear()) {
				return true;
			}
			return false;
		}else if(d.getMonth() != this.month) {
			if(this.month < d.getMonth()) {
				return true;
			}
			return false;
		}else if(d.getDay() != this.day) {
			if(this.day < d.getDay()) {
				return true;
			}
			return false;
		}
		return false;
	}
}

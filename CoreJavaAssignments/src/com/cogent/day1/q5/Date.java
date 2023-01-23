package com.cogent.day1.q5;

public class Date {

	private int day;
	private int month;
	private int year;
	
	public Date(int month, int day, int year) {
		setMonth(month);
		setYear(year);
		setDay(day);

	}
	
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		
		int highestDay=setDayHelper(this.month, this.year);
		try {
			if(day<1 || highestDay>31) {
				throw new IllegalArgumentException("Invalid day enterd: day value must be between 1 and "+ highestDay +"...\nYou have entered "+ day);
			}
			this.day = day;
		}catch(IllegalArgumentException iae) {
			System.out.println(iae.getMessage());
			 this.day=4;
			 System.out.println(" Default value of 4 has been set");
		}
	}
	
	
	private int setDayHelper(int month, int year) {
		switch(year) {
			case 2:
				if(isLeap(year)) {
					return 29;
				}
				else {
					return 28;
				}
			case 4,6,9,11:
				return 30;
			default:
				return 31;
		}
	}
	
	private boolean isLeap(int year) {
		if(year % 4 != 0) {
			return false;
		}
		else if(year % 100 != 0) {
			return true;
		}else if(year % 400 != 0) {
			return false;
		}else {
			return true;
		}
	}
	
	public int getMonth() {
		
		return month;
	}
	public void setMonth(int month) {
		try {
			if(month <1 ||  month >12) {
				throw new IllegalArgumentException("Invalid month enterd: month value must be between 1 and 12...\nYou have entered "+ month);

			}
			this.month = month;
		}catch(IllegalArgumentException iae) {
			System.out.println(iae.getMessage());
			this.month=5;	
			System.out.println("Default value of 5 has been set");
		}
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		try {
			if(year<1) {
				throw new IllegalArgumentException("Invalid year enterd: year value must be positive number...\nYou have entered "+ year);
			}
			this.year = year;
		}catch(IllegalArgumentException iae) {
			System.out.println(iae.getMessage());
			this.year=1995;
			System.out.println("Default value of 1995 has been set" );
		}
	}
	
	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
	

}

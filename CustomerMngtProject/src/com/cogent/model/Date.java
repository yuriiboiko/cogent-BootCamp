package com.cogent.model;


public class Date {

	private int year;
	private int month;
	private int day;


	public Date( int day, int month, int year) {
		super();
		setMonth(month);
		setYear(year);
		setDay(day);
	}

	public Date() {
		super();
		this.year = 1995;
		this.month = 5;
		this.day = 4;
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

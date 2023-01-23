package com.cogent.day10;

public class Rectangle{
	int length;
	int breadth;
	int area;
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
		this.area = length*breadth;
	}

	public String toString() {

		return "Length: "+ length +", Breadth: "+ breadth+ " Area: "+ area ;
	}

	public boolean equals(Object obj) {
		if(obj instanceof Rectangle) {
			Rectangle r = (Rectangle) obj;
			if((length==r.length) & (breadth==r.breadth) & (area==r.area) ) {
				return true;
			}else {
				return false;
			}

		}else {
			return false;

		}
	}
}
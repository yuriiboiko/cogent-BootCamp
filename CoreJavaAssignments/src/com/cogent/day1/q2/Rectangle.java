/**
 * 
 */
package com.cogent.day1.q2;

/**
 * @author  : Yurii Boiko
 * @Date	: Jan 17, 2023
 *
 */
public class Rectangle {
	private int length;
	private int breadth;
	
	
	public Rectangle() {
		super();
		this.length = 0;
		this.breadth = 0;
	}
	
	
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public int getLength() {
		return length;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public int getBreadth() {
		return breadth;
	}
	
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	public int calcArea() {
		return this.length * this.breadth;
	}
	public void display() {
		System.out.println("The length of rectangle is " + this.length + ".");
		System.out.println("The breadth of rectangle is " + this.breadth + ".");
		
	}
	
}

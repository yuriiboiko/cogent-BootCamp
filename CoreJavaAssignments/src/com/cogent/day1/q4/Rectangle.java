/**
 * 
 */
package com.cogent.day1.q4;

/**
 * @author  : Yurii Boiko
 * @Date	: Jan 17, 2023
 *
 */
public class Rectangle {
	private float length;
	private float width;


	public Rectangle() {
		super();
		this.length = 1;
		this.width = 1;
	}


	public Rectangle(float length, float width) {
		super();
		this.length = length;
		this.width = width;
	}

	public float getLength() {
		return length;
	}

	public boolean setLength(float length) {

		if(length>0 & length<20.0) {
			this.length = length;
			return true;
		}
		System.out.println("Error: The entered length is " + length + " must be between 0.00 and 20.00");
		return false;
	}

	public float getWidth() {
		return width;
	}

	public boolean setWidth(float width) {
		if(width>0& width<20.0) {
			this.width = width;
			return true;
		}
		System.out.println("Error: The entered width is " + width + " must be between 0.00 and 20.00");
		return false;
	}

	public float calcArea() {
		return this.length * this.width;
	}

	public float calcPerimeter() {
		return this.length *2+ this.width*2;
	}


	public void display() {
		System.out.println("The length of rectangle is " + this.length + ".");
		System.out.println("The width of rectangle is " + this.width + ".");

	}

}

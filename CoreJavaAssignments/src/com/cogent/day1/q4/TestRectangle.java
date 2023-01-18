/**
 * 
 */
package com.cogent.day1.q4;

import java.util.Scanner;
/**
 * @author  : Yurii Boiko
 * @Date	: Jan 17, 2023
 *Modify the program which is created in assignment 2 as follows
 *The class has attributes length and width, each of which defaults to 1. It should
 *have member functions that calculate the perimeter and area of the rectangle. It
 *should have set and get functions for both length and width. The set functions
 *should verify that length and width are each floating-point numbers larger than
 *0.0 and less than 20.0
 */
public class TestRectangle {

	public static void main(String[] args) {

		
	
		
		Rectangle r1 = new Rectangle();
		createRectangle(r1);
		r1.display();
		System.out.println("The area of rectangle is " + r1.calcArea()+".");
		System.out.println("The perimeter  of rectangle is " + r1.calcPerimeter()+".");

		
		Rectangle r2 = new Rectangle();
		createRectangle(r2);
		r2.display();
		System.out.println("The area of rectangle is " + r2.calcArea()+".");
		System.out.println("The perimeter  of rectangle is " + r2.calcPerimeter()+".");
		
		
		Rectangle r3 = new Rectangle();
		createRectangle(r3);
		r3.display();
		System.out.println("The area of rectangle is " + r3.calcArea()+".");
		System.out.println("The perimeter  of rectangle is " + r3.calcPerimeter()+".");
		
		Rectangle r4 = new Rectangle();
		createRectangle(r4);
		r4.display();
		System.out.println("The area of rectangle is " + r4.calcArea()+".");
		System.out.println("The perimeter  of rectangle is " + r4.calcPerimeter()+".");
		
		Rectangle r5 = new Rectangle();
		createRectangle(r5);
		r5.display();
		System.out.println("The area of rectangle is " + r5.calcArea()+".");
		System.out.println("The perimeter  of rectangle is " + r5.calcPerimeter()+".");
		
	}
	
	private static void createRectangle(Rectangle r) {
		float len;
		float wid;
		Scanner sc = new Scanner(System.in);
		boolean check=false;
		while(!check) {
			System.out.println("Enter a length for the rectangle");
			len = sc.nextFloat();
			check = r.setLength(len);
		}
		check= false;
		while(!check) {
			System.out.println("Enter a width for the rectangle");
			wid = sc.nextFloat();
			check = r.setWidth(wid);
		}
	}

}

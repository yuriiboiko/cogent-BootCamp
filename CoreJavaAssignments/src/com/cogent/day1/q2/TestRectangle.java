/**
 * 
 */
package com.cogent.day1.q2;

import java.util.Scanner;
/**
 * @author  : Yurii Boiko
 * @Date	: Jan 17, 2023
 *Define a class Rectangle with its length and breadth.
 *Provide appropriate constructor(s), which gives facilty of constructing rectangle
 *object with default values of length pf breadth as 0 or passing value of length and
 *breadth externally to constructor.
 *Provide appropriate accessor & mutator methods to Rectangle class.
 *Provide methods to calculate area & to display all information of Rectangle.
 *Design different class TestRectangle class in separate source file, which will
 *contain main function. From this main function, create 5 Rectangle objects by
 *taking all necessary information from the user.
 */
public class TestRectangle {

	public static void main(String[] args) {

		
		int len;
		int bre;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter a length for the first rectangle");
		len = sc.nextInt();
		System.out.println("Enter a breadth for the first rectangle");
		bre = sc.nextInt();
		Rectangle r1 = new Rectangle(len, bre);
		r1.display();
		System.out.println("the area of is " + r1.calcArea());
		
		System.out.println("Enter a length for the second rectangle");
		len = sc.nextInt();
		System.out.println("Enter a breadth for the second rectangle");
		bre = sc.nextInt();
		Rectangle r2 = new Rectangle(len, bre);
		r2.display();
		System.out.println("the area of is " + r2.calcArea());
		
		System.out.println("Enter a length for the thrid rectangle");
		len = sc.nextInt();
		System.out.println("Enter a breadth for the third rectangle");
		bre = sc.nextInt();
		Rectangle r3 = new Rectangle(len, bre);
		r3.display();
		System.out.println("the area of is " + r3.calcArea());
		
		System.out.println("Enter a length for the forth rectangle");
		len = sc.nextInt();
		System.out.println("Enter a breadth for the forth rectangle");
		bre = sc.nextInt();
		Rectangle r4 = new Rectangle(len, bre);
		r4.display();
		System.out.println("the area of is " + r4.calcArea());
		
		System.out.println("Enter a length for the fifth rectangle");
		len = sc.nextInt();
		System.out.println("Enter a breadth for the fifth rectangle");
		bre = sc.nextInt();
		Rectangle r5 = new Rectangle(len, bre);
		r5.display();
		System.out.println("the area of is " + r5.calcArea());
		
	}

}

/**
 * 
 */
package com.cogent.wrapperex;

import java.util.ArrayList;

/**
 * @author  : Yurii Boiko
 * @Date	: Jan 17, 2023
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 35;
		//boxing 
		Integer y= new Integer(x);
		
		//unboxing
		int z=y.intValue();
		System.out.println(x);
		System.out.println(z);
		
		
		//wrapper in a collection
		ArrayList al = new  ArrayList<>();
		
		al.add(1000);
		al.add(10.00);
		
		if(al.get(0) instanceof Integer) {
			System.out.println("Integer");
		}	
		
		if(al.get(1) instanceof Double) {
			System.out.println("Double");
		}		
	}

}

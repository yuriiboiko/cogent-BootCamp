/**
 * Create an abstract class Compartment to represent a rail coach. Provide a abstract
 *function notice in this class. Derive FirstClass, Ladies, General, Luggage classes from
 *the compartment class. Override the notice function in each of them to print notice
 *suitable to the type of the compartment.
 *Create a class TestCompartment . Write main function to do the following:
 *Declare an array of Compartment pointers of size 10.
 *Create a compartment of a type as decided by a randomly generated integer in the
 *range 1 to 4.
 *Check the polymorphic behavior of the notice method.
 */
package com.cogent.assignments.inheritancepolymorphism.q2;

import java.util.Iterator;
import java.util.Random;

/**
 * @author  : Yurii Boiko
 * @Date	: Jan 17, 2023
 *
 */
public class TestCompartment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Compartment[] c = new Compartment[10];
		Random rand = new Random();
		int random;
		for (int i = 0; i < 10; i++) {
			random = rand.nextInt(4);
			random++;
			switch(random) {
				case 1:
					c[i]=new FirstClass();
					break;
				case 2:
					c[i]=new Ladies();
					break;
				case 3:
					c[i]=new General();
					break;
				case 4:
					c[i]=new Luggage();
					break;
			}
			c[i].notice();
		}
		

	}

}

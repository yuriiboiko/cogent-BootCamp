/**
 * 
 */
package com.cogent.upcasting;

/**
 * @author  : Yurii Boiko
 * @Date	: Jan 17, 2023
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Dog  d1 = new Dog();
		//up-casting
		Animal a1= (Animal)d1;
		
			a1.move();
	}

}

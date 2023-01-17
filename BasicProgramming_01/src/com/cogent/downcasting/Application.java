/**
 * 
 */
package com.cogent.downcasting;

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
		
		Animal animal = new Cat();
		//down-casting
		Cat  cat = (Cat)animal;
		cat.meow();
		
		//Animal animal1 = new Dog();//run-time error ClassCastException
		//Cat cat1=(Cat) animal1;
	}

}

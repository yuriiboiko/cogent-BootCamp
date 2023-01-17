/**
 * 
 */
package com.cogent.assignments.inheritancepolymorphism.q1;

/**
 * @author  : Yurii Boiko
 * @Date	: Jan 17, 2023
 *Create an abstract class Instrument which is having the abstract function play.
 *Create three more sub classes from Instrument which is Piano, Flute, Guitar.
 *Override the play method inside all three classes printing a message
 *“Piano is playing tan tan tan tan ” for Piano class
 *“Flute is playing toot toot toot toot” for Flute class
 *“Guitar is playing tin tin tin ” for Guitar class
 *You must not allow the user to declare an object of Instrument class.
 *Create an array of 10 Instruments.
 *Assign different type of instrument to Instrument reference.
 *Check for the polymorphic behavior of play method.
 *Use the instanceof operator to print that which object stored at which index of
 *instrument array.
 */
public class MainQ1 {

	public static void main(String[] args) {
		
		Instrument[] instruments= new Instrument[10];
		instruments[0]= new Guitar();
		instruments[1]= new Piano();
		instruments[2]= new Flute();
		instruments[3]= new Guitar();
		instruments[4]= new Piano();
		instruments[5]= new Flute();
		instruments[6]= new Guitar();
		instruments[7]= new Piano();
		instruments[8]= new Flute();
		instruments[9]= new Piano();

		for(Instrument i: instruments) {//Checking for the polymorphic behavior of play method

			printObjectType(i);
			i.play();
			
		}

		
	}
	
	//Uses the instanceof operator to distinguish which object stored at which index of
	//instrument and print that type
	static private void printObjectType(Instrument i) {
		System.out.print("The data type is ");
		if(i instanceof Guitar) {
			System.out.println("Guitar");

		}else if(i instanceof Piano) {
			System.out.println("Piano");

		}else if(i instanceof Flute) {
			System.out.println("Flute");

		}
	}

}

/**
 * 
 */
package com.cogent.day07;

/**
 * @author  : Yurii Boiko
 * @Date	: Jan 17, 2023
 *
 */
public class Main {
	public static void main(String[] args) {
		
		Car hondaAccord =  new Car();
		Engine engine = new Engine("turbo");
		MusicSystem ms = new MusicSystem(); 
		ms.setId(1001);
		ms.setType("Sony");
		hondaAccord.setMs(ms);//(HAS-A) composition relationship <-weak relationship
		hondaAccord.setEngine(engine); //(HAS-A) aggregation relationship <-strong relationship
		
		hondaAccord.start();
		hondaAccord.stop();
		hondaAccord.showMusicSystemInfo();
		hondaAccord.stop();

		
		
	}

}

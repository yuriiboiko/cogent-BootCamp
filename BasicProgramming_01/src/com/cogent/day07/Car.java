/**
 * 
 */
package com.cogent.day07;

/**
 * @author  : Yurii Boiko
 * @Date	: Jan 17, 2023
 *
 */
public class Car {
	
	private MusicSystem ms;
	private Engine engine;
	
	
	void start() {
		engine.setStatus(true);
		if(engine.isStatus()==true) {
		System.out.println("Car engine "+this.engine.getType()+" started");
		}else {
			System.out.println("Car engine "+this.engine.getType()+" not on");
		}
		
	}
	
	
	void stop() {
		if(engine.isStatus()==true) {
			System.out.println("Car engine "+this.engine.getType()+" stopped");
			engine.setStatus(false);
		}else {
			System.out.println("Car engine "+this.engine.getType()+" was not on");
		}
	}

	void showMusicSystemInfo() {
		System.out.println("music system code " + ms.getId());
		System.out.println("music system type " + ms.getType());
	}

	/**
	 * @return the ms
	 */
	public MusicSystem getMs() {
		return ms;
	}


	/**
	 * @param ms the ms to set
	 */
	public void setMs(MusicSystem ms) {
		this.ms = ms;
	}


	/**
	 * @return the engine
	 */
	public Engine getEngine() {
		return engine;
	}


	/**
	 * @param engine the engine to set
	 */
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

}

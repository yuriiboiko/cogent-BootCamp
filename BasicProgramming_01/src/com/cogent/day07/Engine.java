/**
 * 
 */
package com.cogent.day07;

/**
 * @author  : Yurii Boiko
 * @Date	: Jan 17, 2023
 *
 */
public class Engine {
	
	private String type;
	private boolean status;
	
	
	public Engine(String type) {
		this.setType(type);
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the status
	 */
	public boolean isStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}
	

}

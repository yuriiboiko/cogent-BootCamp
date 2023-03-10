/**
 * 
 */
package com.cogent.managersprint2;

/**
 * @author  : Yurii Boiko
 * @Date	: Jan 16, 2023
 *
 */
public class Task {
	private int taskId;
	private String taskName;
	/**
	 * @param taskId
	 * @param taskName
	 */
	
	public Task(int taskId, String taskName) {
		super();
		this.taskId = taskId;
		this.taskName = taskName;
	}
	/**
	 * @return the taskId
	 */
	public int getTaskId() {
		return taskId;
	}
	/**
	 * @param taskId the taskId to set
	 */
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}
	/**
	 * @return the taskName
	 */
	public String getTaskName() {
		return taskName;
	}
	/**
	 * @param taskName the taskName to set
	 */
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	
	public void print() {
		System.out.print(taskId + " : ");
		System.out.print(taskName);

	}
	
	

}

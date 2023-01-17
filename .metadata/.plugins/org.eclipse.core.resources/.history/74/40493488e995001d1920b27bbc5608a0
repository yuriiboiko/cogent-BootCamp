/**
 * 
 */
package com.cogent.assignment.q1;

import java.util.Scanner;

/**
 * @author  : Yurii Boiko
 * @Date	: Jan 16, 2023
 *
 */
public class TaskDAO {
	static int taskCounter=0;
	/**
	 * 
	 */
	public static Task[] addTask(Task [] tasks) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Task name");
		String taskName= sc.next();
		System.out.println("Enter the TaskId");
		int id= sc.nextInt();
		Task t1 =new Task(id, taskName);
		Task newTasks[] = null;
		if(tasks==null) {
			newTasks = new Task[1];
		}
		else {
			newTasks = new Task[tasks.length+1];
		}
		
		if(tasks==null) {
			newTasks[0]=t1;
		}
		else {
			System.arraycopy(tasks, 0, newTasks,0,tasks.length);
			tasks=null;
			newTasks[taskCounter]=t1;	
		}
		taskCounter++;
		return newTasks;
	}

	public static void updateTask(Task [] tasks) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Task id which you wopuld like to update");
		int id = sc.nextInt();
		for(Task t :tasks) {
			if(t.getTaskId()==id) {
				System.out.println("Task found old name:" + t.getTaskName() + "!");
				System.out.println("Enter a new Task name!");
				String taskName= sc.next();
				t.setTaskName(taskName);
				System.out.println("Succesfully found and updated task");
				return;
			}
			
		}
		System.out.println("taskId : " + id + " couldnt be found!");
		System.out.println("Update Failed");

	}
	
	
	public static Task[] deleteTask(Task [] tasks) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Task id which you wopuld like to delete");
		int id = sc.nextInt();
		int index = deleteTaskHelper(tasks, id);
		
		if(index==-1) {
			System.out.println("taskId : " + id + " couldnt be found!");
			System.out.println("Deletion Failed");
			return tasks;
		}
		
		Task newTasks[] = new Task[tasks.length-1];
			//delete
		for(int i = 0, j=0; i<tasks.length;i++) {
			if(i!=index) {
				newTasks[j]=tasks[i];
				j++;
			}
		}
	 
		System.out.println("taskId : " + id + " was found!");
		System.out.println("Deletion Successful");
		taskCounter--;
		return newTasks;
	}
	
	
	
	private static int deleteTaskHelper(Task [] tasks, int id) {
		
		for(int i =0; i<tasks.length; i++) {
			if(tasks[i].getTaskId()==id) {
				System.out.println("Task found at index" + i);
				return i;
			}
		}
		return -1;
	}
}

/**
 * 
 */
package com.cogent.managersprint2;

import java.util.Scanner;

/**
 * @author  : Yurii Boiko
 * @Date	: Jan 16, 2023
 *
 */
public class TaskManagerApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Task[] tasks = null;
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do {
			displayMenu();
			
			choice= sc.nextInt();
			
			switch(choice) {
			case 1:
				tasks = TaskDAO.addTask(tasks);
				break;
			case 2:
				TaskDAO.updateTask(tasks);
				break;
			case 3:
				tasks = TaskDAO.deleteTask(tasks);
				break;
			case 4:
				TaskDAO.searchTask(tasks);
				break;
			default:
				break;
			}
			displayTasks(tasks);
			
			
			
		}while(choice!=0);
		
		
		
		
		
		
		
		

	}
	
	static void displayTasks(Task[] t) {
		System.out.print("[ ");
		for(Task task: t) {
			task.print();
			System.out.print(", ");

		}
		System.out.println("] ");

	}
	
	static void displayMenu() {
		System.out.println("-------------------------------------");
		System.out.println("            **Menu**");
		System.out.println("1 - Add a new task!");
		System.out.println("2 - Update a new task!");
		System.out.println("3 - Delete a new task!");
		System.out.println("4 - Search a new task!");
		System.out.println("0 - Exit");
		System.out.println("-------------------------------------");
		
	}

}

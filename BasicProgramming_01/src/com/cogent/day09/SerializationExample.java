package com.cogent.day09;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fos;
		ObjectOutputStream oos;
		String path="./src/com/cogent/day09/emp.ser";
		try {
			fos= new FileOutputStream(path);
			oos = new ObjectOutputStream(fos);
			
			Employee emp = new Employee("Yurii", 1000);
			
			oos.writeObject(emp);
			System.out.println("Employee object serializatiioin successful");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}

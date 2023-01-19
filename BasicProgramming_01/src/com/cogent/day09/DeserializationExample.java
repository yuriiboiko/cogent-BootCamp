package com.cogent.day09;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectInputStream ois;
		
		FileInputStream fis;
		String path="./src/com/cogent/day09/emp.ser";
		
		try {
			fis = new FileInputStream(path);
			ois = new ObjectInputStream(fis);
			
			
			Object obj = ois.readObject();
			Employee emp = (Employee) obj;
			emp.printInfo();
			System.out.println("Employee object serializatioin successful");
			
		}  catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}

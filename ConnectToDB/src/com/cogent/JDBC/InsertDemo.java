package com.cogent.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

/*
 * Example of how to put data into the table
 */
public class InsertDemo {
	private static final String Inser_EMPLOYEE_SQL="insert into employee" + "(id, name, salary)values" + "(?,?,?)";


	public static void main(String[] args) {
		InsertDemo id =new InsertDemo();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee id...");
		int empID = sc.nextInt();
		System.out.println("Enter employee name...");
		String empName = sc.next();
		System.out.println("Enter employee salary...");
		int empSal = sc.nextInt();
		
		id.insertRecords(empID, empName, empSal);
		
	}


	public void insertRecords(int empID, String empName, int empSal) {

		try(Connection con = JDBCUtils.getConnection()) {
			System.out.println(Inser_EMPLOYEE_SQL);

			PreparedStatement ps= con.prepareStatement(Inser_EMPLOYEE_SQL);
			ps.setInt(1, empID);
			ps.setString(2, empName);
			ps.setInt(3, empSal);

			int count = ps.executeUpdate();
			if(count>0) {
				System.out.println("Record added");
			}
			else {
				System.out.println("Failed");
			}
			con.close();
			ps.close();

		} catch (Exception e) {
			System.out.println("FAILED TO CONNECT");		
		}
	}

}

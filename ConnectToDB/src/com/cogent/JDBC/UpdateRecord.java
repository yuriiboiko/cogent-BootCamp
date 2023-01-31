package com.cogent.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateRecord {
	
	private static final String Update_EMPLOYEE_SQL="update employee set name=? where id=?";

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.println("Which new name would you like to set.");
		String empName= sc.next();
		System.out.println("Whats the id. ");
		int empID= sc.nextInt();
		UpdateRecord uR= new UpdateRecord();
		uR.updateRecord(empID, empName);
	}
	
	
	public void updateRecord(int empID, String empName) {
		
		try(Connection con = JDBCUtils.getConnection()) {
			System.out.println(Update_EMPLOYEE_SQL);

			PreparedStatement ps= con.prepareStatement(Update_EMPLOYEE_SQL);
			
			
			ps.setString(1, empName);
			ps.setInt(2, empID);

			int count = ps.executeUpdate();
			
			if(count>0) {
				System.out.println("Record updated succesfully");
			}
			else {
				System.out.println("Failed update");
			}
			con.close();
			ps.close();

		} catch (Exception e) {
			System.out.println("FAILED TO CONNECT");		
		}
		
	}
	

}

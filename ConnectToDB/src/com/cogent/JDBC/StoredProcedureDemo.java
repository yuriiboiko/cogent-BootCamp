package com.cogent.JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;


/*
 * Example to call the store function/procedure
 */
public class StoredProcedureDemo {

	public static void main(String[] args) {
		try(Connection con = JDBCUtils.getConnection()) {
			String SQL = "{call getAllProducts()}";
			CallableStatement cstmt = con.prepareCall(SQL);
			ResultSet rs =cstmt.executeQuery();
			while(rs.next()) {
				System.out.println("Employee id is: " + rs.getInt("ID"));
				System.out.println("Employee name is: " +rs.getString("NAME"));
				System.out.println("Employee salary is: " +rs.getInt("SALARY"));
			}
			
		} catch (Exception e) {
			System.out.println("FAILED TO CONNECT");	
			e.printStackTrace();
		}
	}
}

package com.cogent.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class ResultSetMetaDataExample {

	public static void main(String[] args) {
		try(Connection con = JDBCUtils.getConnection()) {

			PreparedStatement ps= con.prepareStatement("select * from employee;");
			
			ResultSet rs= ps.executeQuery();
			
			ResultSetMetaData rsmd= rs.getMetaData();
			
			int count= rsmd.getColumnCount();
			System.out.println("Total columns: " + count);
			for (int i = 1; i <= rsmd.getColumnCount(); i++) {
				System.out.println("Column "+ i + " is : " + rsmd.getColumnName(i) + " of type "+ rsmd.getColumnTypeName(i));
				
			}
			
			con.close();
			ps.close();
		} catch (Exception e) {
			System.out.println("FAILED TO CONNECT");	
			e.printStackTrace();
		}
	}

}

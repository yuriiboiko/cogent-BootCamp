package com.cogent.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/*
 * Example on how to get the values for table
 */
public class SelectPSStatement {
	private static final String QUERY="select * from employee;";


	public static void main(String[] args) {
		try(Connection con = JDBCUtils.getConnection()) {

			PreparedStatement ps= con.prepareStatement(QUERY);
			ResultSet rs= ps.executeQuery();
			while(rs.next()) {

				System.out.println("Employee id is: " + rs.getInt("ID"));
				System.out.println("Employee name is: " +rs.getString("NAME"));
				System.out.println("Employee salary is: " +rs.getInt("SALARY"));
			}


		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}

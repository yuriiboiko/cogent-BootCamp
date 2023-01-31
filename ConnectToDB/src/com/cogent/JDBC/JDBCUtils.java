package com.cogent.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/*
 * Class that connects to database
 */
public class JDBCUtils {

	public static Connection getConnection() {
		Connection con = null;

		//1. load the driver class
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		//2. Establish the connection
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db", "root", "root");

			if(con!=null) {
				System.out.println("Congradulation!!! Connection established");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Some error occured while establishing connection");

			e.printStackTrace();
		}
		return con;
	}

}

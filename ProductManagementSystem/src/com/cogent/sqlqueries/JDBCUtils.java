package com.cogent.sqlqueries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/product_mngm", "root", "root");

			if(con!=null) {
				System.out.println("Congradulation!!! Connection established!");
			}

		} catch (SQLException e) {
			System.out.println("Error occured while establishing connection.");

			e.printStackTrace();
		}
		return con;
	}
}

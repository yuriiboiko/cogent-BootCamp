package com.cogent.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


/*
 * Example to create table in MySQL
 */
public class CreateTable {

	private static final String createTableSQL = "create table users(\r\n"
			+ "id int(3) primary key,\r\n"
			+ "name varchar(20),\r\n"
			+ "email varchar(20),\r\n"
			+ "contry varchar(20),\r\n"
			+ "password varchar(20)\r\n"
			+ ");";



	public static void main(String[] args) {

		
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
			Statement stmt=con.createStatement();  
			stmt.execute(createTableSQL);

		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Some error occured while establishing coinnection");

			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		 
		

	}



}

package com.cogent.sqlqueries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PrintQuery {

	private static final String PRINT_QUERY="select * from product;";

	public static void printQuery(Connection con) {
		
		try {
			PreparedStatement ps = con.prepareStatement(PRINT_QUERY);
			ResultSet rs=ps.executeQuery();
			
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" " + rs.getString(2)+ " "+ rs.getString(3) + " " + rs.getDate(4)+ " "+ rs.getDouble(5)+" "+rs.getDate(6));
			}

			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error while printing the table.");
			e.printStackTrace();
		}
		
		
	}
	
}

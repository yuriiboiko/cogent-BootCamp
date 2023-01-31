package com.cogent.sqlqueries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectQueryById {
	
	private static final String SELECT_PRODUCT_SQL="select * from product where pid=?;";

	public static void selectQueryById(Connection con, int pid) {
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(SELECT_PRODUCT_SQL);
			ps.setInt(1, pid);
			
			ResultSet rs= ps.executeQuery();
			if(rs.next()==false) {
				System.out.println("Couldn't find product with pid: " + pid);
				return;
			}
			System.out.println(rs.getInt(1)+" " + rs.getString(2)+ " "+ rs.getString(3) + " " + rs.getDate(4)+ " "+ rs.getDouble(5)+" "+rs.getDate(6));
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" " + rs.getString(2)+ " "+ rs.getString(3) + " " + rs.getDate(4)+ " "+ rs.getDouble(5)+" "+rs.getDate(6));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error with find by id query");
			e.printStackTrace();
		}

		
		
		
	}

}

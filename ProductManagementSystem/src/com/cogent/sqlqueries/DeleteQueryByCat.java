package com.cogent.sqlqueries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteQueryByCat {
	private final static String DELETE_PRODUCT_SQL = "delete from product where pcat=?;";

	public static void deleteQueryByCat(Connection con, String pCat) {
		
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(DELETE_PRODUCT_SQL);
			ps.setString(1, pCat);
			int count = ps.executeUpdate();

			if(count>0) {
				System.out.println("Record deleted succesfully");
			}
			else {
				System.out.println("Failed to deleted");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error with deletion by category query");
			e.printStackTrace();
		}
	}
}

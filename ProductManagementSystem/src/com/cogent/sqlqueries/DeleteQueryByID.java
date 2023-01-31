package com.cogent.sqlqueries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteQueryByID {

	private static final String DELETE_PRODUCT_SQL="delete from product where pid=?;";

	public static void deleteQueryByID(Connection con, int id) {

		PreparedStatement ps;
		try {
			ps = con.prepareStatement(DELETE_PRODUCT_SQL);
			ps.setInt(1, id);
			int count = ps.executeUpdate();

			if(count>0) {
				System.out.println("Record deleted succesfully");
			}
			else {
				System.out.println("Failed to deleted");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error with deletion by id query");
			e.printStackTrace();
		}


	}
}

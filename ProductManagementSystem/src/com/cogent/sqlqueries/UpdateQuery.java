package com.cogent.sqlqueries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateQuery {

	private static final String UPDATE_PRODUCT_SQL="update product set pname=? where pid=?;";
	public static void updateQuery(Connection con, int pid){

		Scanner sc =new Scanner(System.in);
		System.out.println("Whats the new name would you like to set.");
		String pName= sc.next();

		try {
			PreparedStatement ps = con.prepareStatement(UPDATE_PRODUCT_SQL);
			ps.setString(1, pName);
			ps.setInt(2, pid);
			int count = ps.executeUpdate();

			if(count>0) {
				System.out.println("Record updated succesfully");
			}
			else {
				System.out.println("Failed update");
			}


		} catch (SQLException e) {
			System.out.println("Error with update name query");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}

package com.cogent.sqlqueries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.cogent.model.Product;

public class CreateProductEntry {


	private static final String INSERT_PRODUCT_SQL="insert into product" + "(pid, pname, pcat, manufactureDate, price, expityDate)values" + "(?,?,?,?,?,?)";
	static Scanner sc = new Scanner(System.in);


	public static void createProductEntry(Connection con, Product p) {

		try {
			PreparedStatement ps= con.prepareStatement(INSERT_PRODUCT_SQL);
			ps.setInt(1, p.getPid());
			ps.setString(2, p.getPname());
			ps.setString(3,p.getPcat());
			ps.setDate(4, p.getManufactureDate());
			ps.setDouble(5, p.getPrice());
			ps.setDate(6, p.getExpityDate());

			int count = ps.executeUpdate();
			if(count>0) {
				System.out.println("Record added");
			}
			else {
				System.out.println("Failed to add");
			}
			ps.close();
		} catch (SQLException e) {
			System.out.println("Error with inserting product into table.");
			e.printStackTrace();
		}

	}


}

package com.cogent.dao;

import java.sql.Connection;
import java.sql.Date;
import java.util.Scanner;

import com.cogent.model.Product;
import com.cogent.sqlqueries.*;
/*
import com.cogent.sqlqueries.CreateProductEntry;
import com.cogent.sqlqueries.DeleteQueryByCat;
import com.cogent.sqlqueries.DeleteQueryByID;
import com.cogent.sqlqueries.JDBCUtils;
import com.cogent.sqlqueries.PrintQuery;
import com.cogent.sqlqueries.SelectQueryByCat;
import com.cogent.sqlqueries.SelectQueryById;
import com.cogent.sqlqueries.UpdateQuery;
*/
public class ProductDAOImpl implements ProductDAO {
	
	Connection con=null;
	
	{
		con=JDBCUtils.getConnection();
	}
	
	
	Scanner sc = new Scanner(System.in);

	@Override
	public void creat() {
		creatHelper();
	}
	
	private void creatHelper() {
		System.out.println("Enter product id...");
		int pid = sc.nextInt();
		System.out.println("Enter product name...");
		String pname = sc.next();
		System.out.println("Enter product catagory...");
		String pcat = sc.next();
		System.out.println("Enter product price...");
		double price = sc.nextDouble();
		System.out.println("Enter product manufacture date.");
		System.out.println("Year...");
		int mYear = sc.nextInt();
		System.out.println("Month...");
		int mMonth = sc.nextInt();
		System.out.println("Day...");
		int mDay = sc.nextInt();
		Date mDate = new Date(mYear, mMonth, mDay);
		System.out.println("Enter product experation date.");
		System.out.println("Year...");
		int eYear = sc.nextInt();
		System.out.println("Month...");
		int eMonth = sc.nextInt();
		System.out.println("Day...");
		int eDay = sc.nextInt();
		Date eDate = new Date(eYear, eMonth, eDay);
		Product p =new Product(pid, pname, pcat, eDate, price, eDate);
		
		CreateProductEntry.createProductEntry(con, p);
		
	}

	
	
	@Override
	public void print() {
		PrintQuery.printQuery(con);

	}

	@Override
	public void deleteId(int pid) {

		DeleteQueryByID.deleteQueryByID(con, pid);
	}

	@Override
	public void change(int pid) {
		UpdateQuery.updateQuery(con, pid);
	}

	@Override
	public void deleteCat(String pCat) {
		DeleteQueryByCat.deleteQueryByCat(con, pCat);
	}

	@Override
	public void findId(int pid) {
		SelectQueryById.selectQueryById(con, pid);
	}

	@Override
	public void findCat(String pCat) {
		SelectQueryByCat.selectQueryByCat(con, pCat);
	}

			
	
	
}

package com.cogent.dao;

import java.sql.Connection;
import java.sql.Date;
import java.util.Scanner;

import com.cogent.model.Product;
import com.cogent.sqlqueries.*;

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
		String mDayStr= mYear + "-"+ mMonth+"-"+mDay;
		Date mDate = Date.valueOf(mDayStr);
		System.out.println("Enter product experation date.");
		System.out.println("Year...");
		int eYear = sc.nextInt();
		System.out.println("Month...");
		int eMonth = sc.nextInt();
		System.out.println("Day...");
		int eDay = sc.nextInt();
		String eDayStr= eYear + "-"+ eMonth+"-"+eDay;
		Date eDate = Date.valueOf(eDayStr);
		Product p =new Product(pid, pname, pcat, mDate, price, eDate);
		
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

package com.gl.employee.dao.impl;


import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.gl.controller.EmployeeMapper;
import com.gl.employee.dao.EmployeeDAO;
import com.gl.employee.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO
{

	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource)
	{
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public void insert(Employee e)
	{
		String insertSQL = "INSERT INTO EMPLOYEE (EMPLOYEE_ID, EMP_NAME, AGE, SALARY) VALUES (?, ?, ?,?)";

		int result = jdbcTemplate.update(insertSQL, new Object[] { e.getEmployeeId(),e.getName(), e.getAge(),e.getSalary() });
		
		if(result!=0) {
			System.out.println("Insert succesful");
		}else {
			System.out.println("Insert unsuccesful");

		}
		
	}
	
	
	public void update(int id) {
		String updateSQL ="update employee set emp_name=? where employee_id= ?";
		System.out.println("Whats new name?");
		Scanner sc = new Scanner(System.in);
		String name=sc.next();
		
		int result = jdbcTemplate.update(updateSQL, name, id);
		
		if(result!=0) {
			System.out.println("Update succesful");
		}else {
			System.out.println("Update unsuccesful");
		}
	}
	
	public void show() {
		String sql = "select * from employee";
		List<Employee> empList= jdbcTemplate.query(sql, new EmployeeMapper());
		System.out.println("---------------------------------------------");
		System.out.println("Results:");
		for (Iterator<Employee> iterator = empList.iterator(); iterator.hasNext();) {
			Employee employee = (Employee) iterator.next();
			System.out.println(employee);
		}
		System.out.println("---------------------------------------------");
	}
	
	
	public void delete() {
		String deleteSQL ="delete from employee where employee_id=?";
		
		System.out.println("Please enter the employee ID to be deleted!");
		Scanner sc = new Scanner(System.in);
		int id=sc.nextInt();
		
		int result=jdbcTemplate.update(deleteSQL, id);
		
		if(result!=0) {
			System.out.println("Delete succesful");
		}else {
			System.out.println("Delete unsuccesful");

		}
	}
	
}

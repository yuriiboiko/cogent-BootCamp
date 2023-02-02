package com.cogent.doa.impl;

import java.sql.JDBCType;

import org.springframework.jdbc.core.JdbcTemplate;

import com.cogent.doa.EmployeeDAO;
import com.cogent.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO{
	
	private JdbcTemplate jdbcTemplate;
	
	public void insert(Employee e) {
		
		String sql = "Insert into Employee"+"(employee_id, emp_name, age, salary) values(?,?,?,?)";
		jdbcTemplate.update(sql, new Object[] {e.getId(),e.getName(),e.getAge(),e.getSalary()});
	}

}

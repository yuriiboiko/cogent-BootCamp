package com.gl.controller;

import com.gl.employee.model.Employee;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


public class EmployeeMapper implements RowMapper<Employee> {

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee e = new Employee();
		e.setEmployeeId(rs.getInt("employee_id"));
		e.setName(rs.getString("emp_name"));
		e.setAge(rs.getInt("age"));
		e.setSalary(rs.getInt("salary"));
		return e;
	}

}

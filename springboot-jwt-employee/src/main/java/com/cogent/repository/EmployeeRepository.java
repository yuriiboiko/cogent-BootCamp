package com.cogent.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cogent.entity.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>  {

}

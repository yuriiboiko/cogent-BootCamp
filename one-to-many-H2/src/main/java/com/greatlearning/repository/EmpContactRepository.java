package com.greatlearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.entity.EmployeeContact;

@Repository
public interface EmpContactRepository extends JpaRepository<EmployeeContact, Integer> {

}

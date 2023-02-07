package com.greatlearning;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.greatlearning.entity.Employee;
import com.greatlearning.entity.EmployeeContact;

import com.greatlearning.repository.EmployeeRepository;

@SpringBootApplication
public class OneToOneApplication implements CommandLineRunner {

	@Autowired
	EmployeeRepository er;

	public static void main(String[] args) {
		SpringApplication.run(OneToOneApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		
		Employee emp = new Employee();
		emp.setName("Bob");
		
		EmployeeContact ec= new EmployeeContact();
		ec.setPhoneNumber(123456L);
		
		EmployeeContact ec1= new EmployeeContact();
		ec1.setPhoneNumber(123454536L);
		Set<EmployeeContact> contacts= new HashSet<>();
		contacts.add(ec);
		contacts.add(ec1);
		emp.setEmpContact(contacts);
		er.save(emp);
		System.out.println("Saved!!!");

		
		

	}

}

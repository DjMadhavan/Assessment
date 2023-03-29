package com.springboot.project.employeemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.project.employeemanagement.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
	
	

}


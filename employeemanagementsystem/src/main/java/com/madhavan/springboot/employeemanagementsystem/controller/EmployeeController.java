package com.madhavan.springboot.employeemanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.madhavan.springboot.employeemanagementsystem.model.Employee;
import com.madhavan.springboot.employeemanagementsystem.repository.EmployeeRepository;

@RestController
@RequestMapping("api/")
public class EmployeeController {
	@Autowired
	private EmployeeRepository empRepository;
	
	@GetMapping("emps")
	public List < Employee > getUsers(){
		return this.empRepository.findAll();
	}

}
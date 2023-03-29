package com.springboot.project.employeemanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.project.employeemanagement.model.Employee;
import com.springboot.project.employeemanagement.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository erep;
	
	public Employee saveEmp(Employee emp) {
		return erep.save(emp);
	}
	
	public List<Employee> saveEmps(List<Employee> emps){
		return erep.saveAll(emps);
	}
	
	
	public List<Employee> getEmps(){
		return erep.findAll();
	}
	
	public Employee getEmpById(int id) {
		return erep.findById(id).orElse(null);
	}
	
	/*public Employee getEmpByName(String name) {
		return erep.findByName(name);
 }*/
	
	public String deleteEmp(int id) {
		erep.deleteById(id);
		return "Employee Removed ||" +id;
		
	}
	
	public Employee updateEmp(Employee emp) {
		Employee exemp=erep.findById(emp.getId()).orElse(null);
		exemp.setName(emp.getName());
		exemp.setEmail(emp.getEmail());
		exemp.setSalary(emp.getSalary());
		return erep.save(exemp);
	}
}
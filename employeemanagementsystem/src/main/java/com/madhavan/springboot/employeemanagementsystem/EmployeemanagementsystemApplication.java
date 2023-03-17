package com.madhavan.springboot.employeemanagementsystem;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.madhavan.springboot.employeemanagementsystem.model.Employee;
import com.madhavan.springboot.employeemanagementsystem.repository.EmployeeRepository;

@SpringBootApplication
public class EmployeemanagementsystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(EmployeemanagementsystemApplication.class, args);
	}
	@Autowired
	private EmployeeRepository empRepository;
	@Override
	public void run(String...args) throws Exception{
		this.empRepository.save(new Employee("Raja", "Brahman", "raja@infosys.com",20000));
		this.empRepository.save(new Employee("Kishore", "Kumar", "kkumar@infosys.com",19500));
		this.empRepository.save(new Employee("Navaneetha", "Kannan", "kannan@infosys.com",16000));
	}

}



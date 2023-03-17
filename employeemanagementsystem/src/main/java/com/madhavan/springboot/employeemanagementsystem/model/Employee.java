package com.madhavan.springboot.employeemanagementsystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "Fname")
    private String firstName;

    @Column(name = "Lname")
    private String lastName;

    private String email;
    private int salary;

    public Employee() {

    }

    public Employee(String firstName, String lastName, String email, int salary) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.salary=salary;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getSalary() {
    	return salary;
    }
    public void setSalary(int salary) {
    	this.salary=salary;
    }
}

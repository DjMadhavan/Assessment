import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-create-employee-component',
  templateUrl: './create-employee-component.component.html',
  styleUrls: ['./create-employee-component.component.css']
})
export class CreateEmployeeComponentComponent implements OnInit {
  employee:Employee =new Employee();
  submitted=false;
  constructor(private employeeService:EmployeeService , private router:Router){}
  ngOnInit(): void {

  }
  newEmployee():void{
    this.submitted=false;
    this.employee=new Employee();
  }
  save(){
    this.employeeService.createEmployee(this.employee).subscribe (data=>{
      console.log(data);
      this.employee=new Employee();
      this.gotoList();
    })
      
  }
  OnSubmit(){
    this.submitted=true;
    this.save();
  }
  gotoList(){
    this. router .navigate(['/employee']);
  }


}

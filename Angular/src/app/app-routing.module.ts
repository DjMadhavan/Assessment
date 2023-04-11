import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EmployeeListComponent } from './employee-list/employee-list.component';
import { CreateEmployeeComponentComponent } from './create-employee-component/create-employee-component.component';
const routes: Routes = [
  { path: 'employee', component: EmployeeListComponent },
  { path: 'add', component: CreateEmployeeComponentComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

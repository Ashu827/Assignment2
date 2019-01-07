import { Component, OnInit } from '@angular/core';
import { IEmployee } from '../iemployee';

@Component({
  selector: 'app-emp-list',
  templateUrl: './emp-list.component.html',
  styleUrls: ['./emp-list.component.css']
})
export class EmpListComponent implements OnInit {

  pageTitle:string="Employee Details";

  _listFilter:string;
  get listFilter():string{
    return this.listFilter;
  }
  set listFilter(value:string){
    this._listFilter=value;
    this.filterproducts=this.listFilter?this.performFilter (this.listFilter):this.employees;
  }
    filterproducts:IEmployee[];

  employees:IEmployee[]=[
    {
      empId:"E001",
      name:"Ashutosh",
      email:"ak@gmail.com",
      phone:"123456",
      salary:"15400",
      appraisalRating:"5"
    },
    {
      empId:"E002",
      name:"Ashutosh Poddar",
      email:"ashutosh@gmail.com",
      phone:"987654321",
      salary:"154000",
      appraisalRating:"4"
    }
  ];
  performFilter(filterBy:string):IEmployee[]{
    filterBy=filterBy.toLocaleUpperCase();
    return this.employees.filter((emp:IEmployee)=>
    emp.name.toLocaleUpperCase().indexOf(filterBy)!=1);

  }
  constructor() {
    this.filterproducts=this.employees;
    this.listFilter='Ashutosh';
   }

  ngOnInit() {

  }

}

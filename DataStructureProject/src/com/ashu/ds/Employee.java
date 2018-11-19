package com.ashu.ds;

public class Employee {
	int empid;
	String ename;
	int age;

	Employee() {
		empid = 1;
		ename = "ashu";
		age = 12;
	}

	void show() {
		System.out.println(empid);
		System.out.println(ename);
		System.out.println(age);
	}
	 Employee(int empid,String ename,int age){
	this.empid=empid;
	this.ename=ename;
	this.age=age;

}
}

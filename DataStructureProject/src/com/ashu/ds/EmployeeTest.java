package com.ashu.ds;

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		Employee employee=new Employee();
		employee.show();
		Employee employee2=new Employee(11,"Kumar",18);
		employee2.show();
		
	}

}

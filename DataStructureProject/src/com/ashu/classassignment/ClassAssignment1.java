package com.ashu.classassignment;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ClassAssignment1 {

	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int Array[]=new int[5];
		for(int i=0;i<5;i++)
		{
			Array[i]=sc.nextInt();
		}
		Assignment2 assignment=new Assignment2();
		
		assignment.Ascending(Array);
			
	
	}
}

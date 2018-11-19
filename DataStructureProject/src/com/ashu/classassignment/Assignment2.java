package com.ashu.classassignment;

public class Assignment2 {
	
	
	 void Ascending(int Array[])
	{
		int size=Array.length;
		int temp=0;
		for(int i=0;i<Array.length;i++)
		{
			for(int j=i+1;j<Array.length;j++)
			{
				if(Array[i]>Array[j])
				{
				temp=Array[i];
				Array[i]=Array[j];
				Array[j]=temp;
				}
			}
			System.out.println(Array[i]);
		}
	}

	 
}
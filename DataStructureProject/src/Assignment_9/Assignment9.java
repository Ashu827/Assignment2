package Assignment_9;

import java.util.Scanner;

public class Assignment9 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int Array[][]=new int[3][3];
		
		for(int i=0;i<Array.length;i++)
		{
			for(int j=0;j<Array.length;j++)
			{
				System.out.println("Enter marks for "+(i+1)+"st student in "+(j+1)+ "subject");
				Array[i][j]=scanner.nextInt();
			}
		}
		int sum=Array[0][0]+Array[0][1]+Array[0][2];
		int sum1=Array[1][0]+Array[1][1]+Array[1][2];
		int sum2=Array[2][0]+Array[2][1]+Array[2][2];
		
		System.out.println("Total scored by all student in each subject is "+sum);
		System.out.println("Average is "+sum/3);
		System.out.println("Total scored by all student in each subject is "+sum1);
		System.out.println("Average is "+sum1/3);
		System.out.println("Total scored by all student in each subject is "+sum2);
		System.out.println("Average is "+sum2/3);
		
		int sum3=Array[0][0]+Array[1][0]+Array[2][0];
		int sum4=Array[0][1]+Array[1][1]+Array[2][1];
		int sum5=Array[0][2]+Array[1][2]+Array[2][2];
		
		System.out.println("Total scored by each student in each subject is "+sum3);
		System.out.println("Average is "+sum3/3);
		System.out.println("Total scored by each student in each subject is "+sum4);
		System.out.println("Average is "+sum4/3);
		System.out.println("Total scored by each student in each subject is "+sum5);
		System.out.println("Average is "+sum5/3);
		
		
		
	}

}

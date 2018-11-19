package com.ashu.asignment;

public class BasicAssignment {

	
	public static void main(String[] args) {
	
//		int number=1,j=0;
//		for(int i=1;i<=10;i++) {
//			System.out.println(i);
//		}
//		while(number<=10) {
//			System.out.println(number);
//			number++;
//		}
//		do {
//			System.out.println(j);
//			j++;
//		}while(j<=10);
		
//		int number=10,j=10;
//		for(int i=10;i>=1;i--) {
//			System.out.println(i);
//		}
//		while(number>=1) {
//			System.out.println(number);
//			number--;
//		}
//		do {
//			System.out.println(j);
//			j--;
//		}while(j>=1);

//		

		int A[]=new int[]{1,5,4,6};
		int temp=0;
		for(int i=0;i<A.length;i++){
			for(int j=i+1;j<A.length;j++)
			{
				if(A[i]>A[j])
				{
				temp = A[i];
				A[i]=A[j];
				A[j]=temp;
				}
			}
				System.out.println(A[i]);
		}
	
	}
}
	

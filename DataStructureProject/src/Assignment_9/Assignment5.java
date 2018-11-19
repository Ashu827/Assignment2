package Assignment_9;

import java.util.Scanner;

public class Assignment5 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter value for CTC");
		int CTC=scanner.nextInt();
		if(CTC>0 && CTC<=180000){
		
			System.out.println(" Tax Amount is Nil");
		}
		else if(CTC>=181000 && CTC<=300000)
		{
			int x=CTC-180000;
			double y=x*0.1;
			System.out.println(y);
		}
		else if(CTC>=300001 && CTC<=500000)
		{
			int x=
			int Taxamount1=CTC/10;
			System.out.println(" Tax Amount is "+Taxamount1);
		
		}
		else if(CTC>300001 && CTC<=500000){
		
		
			int Taxamount3=CTC/5;
			System.out.println(" Tax Amount is "+Taxamount3);
		
		}
		else if(CTC>500001 && CTC<=1000000)
	
		{
			int Taxamount4=CTC*3/10;
			System.out.println(" Tax Amount is "+Taxamount4);
		}

		
		
//		for(int i=0;i<=6;i++){
//			System.out.print("_ ");
//		}
//		System.out.println();
//			for(int j=0;j<=6;j++){
//				System.out.print("|");
//				for(int k=0;k<=11;k++){
//				System.out.print(" ");
//				}
//				System.out.println("|");
//			}
//			for(int l=0;l<=7;l++){
//				System.out.print("- ");
//			}

				
			
		
	
	
	
	}
		
	}



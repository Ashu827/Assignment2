package Assignment_9;

import java.util.Scanner;
import java.lang.Math;

public class Assignment1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int Armstrong=sc.nextInt();
		int result=0,count=0,mod=0;
		int number=Armstrong;
		while(number!=0){
			number=number/10;
			
			count++;
		}
		number=Armstrong;
		while(number!=0)
		{
			 mod=number%10;
			result=(int) (result+(Math.pow(mod, count)));
			number=number/10;
		}
		if(result==Armstrong)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not a  Armstrong Number");

	}

}

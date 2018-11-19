package Assignment_9;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
			System.out.println("Enter value for principal,rate and time");
			int principle=scanner.nextInt();
			double rate=scanner.nextDouble();
			int time=scanner.nextInt();
			double SimpleInterest=(principle*rate*time)/100;
			double compoundInterest=(double) (principle*(Math.pow((1+rate/100), time))-1);
			System.out.println("Simple Interest value is "+SimpleInterest);
			System.out.println("Compound Interest value is "+compoundInterest);

	}

}

package Assignment_9;

import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter marks for 3 subjects");
	int Subject1 = sc.nextInt();
	int Subject2 = sc.nextInt();
	int Subject3 = sc.nextInt();
	if(Subject1>60 && Subject2>60 && Subject3>60)
		System.out.println("pass");
	else if(Subject1>60&&Subject2>60||Subject2>60&&Subject3>60||Subject3>60&&Subject1>60)
		System.out.println("promoted");
	else 
		System.out.println("failed");
	}
		
	

	
}

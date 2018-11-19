package Assignment_9;

import java.util.Scanner;

public class Assignment6 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String Username="Ashutosh";
		String Password="Kumar";
		String user=" ";
		String pass=" ";
		
		user=scanner.next();
		pass=scanner.next();
		int count=0;
		System.out.println("Enter username and password");
			if(user.equals(Username) && pass.equals(Password))
			{
				System.out.println("Welcome");
			}
			else if(Username!=user && Password!=pass )
			{
					for(int j=0;j<2;j++)
					{
					System.out.println("please again enter valid username and password");
					user=scanner.next();
					pass=scanner.next();
					if(Username.equals(user) && Password.equals(pass)){
					System.out.println("Welcome");
						break;
					}
					count++;
					if(count==2)
					System.out.println("Contact Admin");
					}
					
				}
	}

}

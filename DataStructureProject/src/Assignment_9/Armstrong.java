package Assignment_9;

public class Armstrong {
	int x;
	int count=0;
	
	public int findArmstrong(int num,int a)
	{

	while(num!=0)
	{
		
		x=num%10;
		a= a+x*x*x;
		num/=10 ;
		//return findArmstrong(num,a);
	}
	return a;
	}
	
	

}

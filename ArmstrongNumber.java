
public class ArmstrongNumber {

	public static void main(String[] args) {
		int number=0,result=0;
	for(int i=100;i<=999;i++) {
		number=i;
		result=0;
		while(number!=0)
		{
			int remainder=number%10;
			result+=remainder*remainder*remainder;
			number=number/10;
			
		}
		if(result==i)
			System.out.println(i);
	}

	}

}

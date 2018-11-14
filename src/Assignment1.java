
public class Assignment1 {

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

		for(int k1=2;k1<=10;k1++) {
			if (k1%2==0)
			System.out.println(k1);
		}
		int k2=1;
		while(k2<=10) {
			if(k2%2==0)
			System.out.println(k2);
			k2++;
		}
		int k3=1;
		do {
			if(k3%2==0)
			System.out.println(k3);
			k3++;
		}while(k3<=10);
		
		for(int j1=1;j1<=10;j1++) {
			if (j1%2!=0)
			System.out.println(j1);
		}
		int j2=1;
		while(j2<=10) {
			if(j2%2!=0)
			System.out.println(j2);
			j2++;
		}
		int j3=1;
		do {
			if(j3%2!=0)
			System.out.println(j3);
			j3++;
		}while(j3<=10);
		int result=0;
	for(int i=1;i<=10;i++)
		result+=i;
	System.out.println(result);
	int m1=1;
	int m2=0;
	while(m1>=10)
	{
		result+=m1;
	}
		System.out.println(result);
		do
		{
			result+=m2;
			m2++;
			System.out.println(result);
		}while(m2>=10);
	
	}
	
	
	

}

package Assignment_9;

public class Assignmentdemo {

	public static void main(String[] args) {
		Armstrong A=new Armstrong();
		int arm;
		System.out.println("Armstrong numbers between 1 to 1000");
		for(int num=1;num<500;num++)
		{
		arm=A.findArmstrong(num, 0);
		if(arm==num)
		      System.out.println(num);
		}

	}

}

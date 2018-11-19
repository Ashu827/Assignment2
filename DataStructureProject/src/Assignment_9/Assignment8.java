package Assignment_9;

public class Assignment8 {

	public static void main(String[] args) {
		int[] Array={5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		int temp=0;
		System.out.println("Bubble sort is");
		for(int i=0;i<Array.length;i++)
		{
			for(int j=i+1;j<Array.length-1;j++)
			{
				if(Array[i]>Array[j])
				{
					temp=Array[i];
					Array[i]=Array[j];
					Array[j]=temp;
				}

			}

			System.out.print(Array[i]+" ");
		}



	}

}

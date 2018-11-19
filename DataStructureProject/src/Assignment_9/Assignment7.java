package Assignment_9;

import java.util.Scanner;

public class Assignment7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int Array[] = new int[5];
		int i = 0;
		System.out.println("Enter Array Element");
		for (i = 0; i < Array.length; i++) {
			Array[i] = scanner.nextInt();
		}
		System.out.println("Enter Search Element");
		int SearchElement = scanner.nextInt();
		boolean result = false;
		for (int j = 0; j < Array.length; j++) {
			if (SearchElement == Array[j]) {
				System.out.println("Element found");
				result = true;
				break;
			}

		}
		if(!result){
			System.out.println("not found1");
		}

	}

}

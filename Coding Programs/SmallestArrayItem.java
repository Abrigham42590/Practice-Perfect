import java.util.Scanner;

public class SmallestArrayItem {
	public static void main(String[] args) {
		
		final int NUMBERS = 6;
		
		@SuppressWarnings("resource")
		Scanner array = new Scanner(System.in);
		
		int[] numbers = new int[NUMBERS];
		int[] numbers2 = new int[NUMBERS];
			
		
		System.out.print("Please enter 5 values for array 1 \n");
		
		for (int count = 0; count < 5; count++) {
			System.out.print("");
			numbers[count] = array.nextInt();
		}
		
		System.out.print("Please enter 5 values for array 2 \n");
		
		for (int count = 0; count < 5; count++) {
			System.out.print("");
			numbers2[count] = array.nextInt();
		}
		
		
		 if (numbers[3] == numbers2[3]) {
					System.out.println("The Smallest match in the array is : " + numbers[3]);
		 }
		 
		 else if (numbers[4] == numbers2[4]) {
			 System.out.println("The Smallest match in the array is : " + numbers[4]);
		 }
		 
		 else 
			 System.out.println("There is no smallest matching integer!");

		
	}
}

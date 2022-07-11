import java.util.Scanner;

public class BarChart {
	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		Scanner words = new Scanner(System.in);
		
		int number1, number2, number3, number4, number5;
		
		System.out.print("Enter sales for store 1:\n");
		number1 = words.nextInt();
		
		System.out.print("Enter sales for store 2:\n");
		number2 = words.nextInt();
		
		System.out.print("Enter sales for store 3:\n");
		number3 = words.nextInt();
		
		System.out.print("Enter sales for store 4:\n");
		number4 = words.nextInt();
		
		System.out.print("Enter sales for store 5:\n");
		number5 = words.nextInt();
		
		System.out.print("\n");
		
		System.out.print("SALES BAR CHART\n");
		if (number1 == 1000) {
			System.out.print("Store 1: **********\n");
		}
		
		else if (number1 == 800) {
			System.out.print("Store 1: ********\n");
		}
		
		if (number2 == 1200) {
			System.out.print("Store 2: ************\n");
		}
		
		else if (number2 == 1000) {
			System.out.print("Store 2: **********\n");
		}
	
		if (number3 == 1800) {
			System.out.print("Store 3: ******************\n");
		}
		
		else if (number3 == 1700) {
			System.out.print("Store 3: *****************\n");
		}
		
		else if (number3 == 1200) {
			System.out.print("Store 3: ************\n");
		}
		
		if (number4 == 800) {
			System.out.print("Store 4: ********\n");
		}
		
		else if (number4 == 1400) {
			System.out.print("Store 4: **************\n");
		}
		
		if (number5 == 1900) {
			System.out.print("Store 5: *******************\n");
		}
		
		else if (number5 == 1000) {
			System.out.print("Store 5: ************\n");
		}
		
		
	}
}
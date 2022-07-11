import java.util.Scanner;

public class InternetServiceProviderPart2 {
	public static void main(String[] args) {
		
		String letter;
		
		int numbers;
		double total;
		
		@SuppressWarnings("resource")
		Scanner letters = new Scanner(System.in);
		
		System.out.print("Enter the letter of the package purchased: \n");
		letter = letters.nextLine();
		
		System.out.print("Enter the number of hours that were used: \n");
		numbers = letters.nextInt();
		
		if (letter.equals("A") && numbers == 10) {
			total = 9.95; 
			
			
		}
		
		else if (letter.equals("A") && numbers > 10) {
			total = (numbers - 10) * 2.00 + 9.95;
			
			System.out.println("Your total charges are $" + total);
			System.out.print("You would have saved $");
			System.out.printf("%.2f", (total - 23.95));
			System.out.println(" if you had gotten package B");
			System.out.print("You would have saved $");
			System.out.printf("%.2f", (total - 19.95));
			System.out.print(" if you had gotten package C");
			
			
		}
		
		else if (letter.equals("B") || letter.equals("b") && numbers == 10) {
			total = 13.95;
			
			System.out.print("Your total charges are $" + total);
		}
		
		else if (letter.equals("B") || letter.equals("b") && numbers > 20) {
			total = (numbers - 20) * 1.00 + 13.95;
			
			System.out.println("Your total charges are $" + total);
			System.out.print("You would have saved $");
			System.out.printf("%.2f", (total - 19.95));
			System.out.print(" if you had gotten package C");
		}
		
		else if (letter.equals("C")) {
			total = 19.95;
			
			System.out.print("Your total charges are $" + total);
			
		}
		
		else
			System.out.print("That package input was not an option.");
	
	}
}
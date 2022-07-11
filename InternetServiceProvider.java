
import java.util.Scanner;

public class InternetServiceProvider {
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
			
			System.out.print("Your total charges are $" + total);
			
			
		}
		
		else if (letter.equals("A") && numbers > 10) {
			total = (numbers - 10) * 2.00 + 9.95;
			
			System.out.print("Your total charges are $" + total);
			
			
		}
		
		else if (letter.equals("b") && numbers == 10) {
			total = 13.95;
			
			System.out.print("Your total charges are $" + total);
		}
		
		else if (letter.equals("b") && numbers > 20) {
			total = (numbers - 10) * 1.00 + 13.95;
			
			System.out.print("Your total charges are $" + total);
		}
		
		else if (letter.equals("C")) {
			total = 19.95;
			
			System.out.print("Your total charges are $" + total);
			
		}
		
		else
			System.out.print("That package input was not an option.");
	
	}
}
import java.util.Scanner;


public class BankCharges {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner numbers = new Scanner(System.in);
		
		double checks, total;
		
		System.out.print("Please enter the number of checks written this month:\n");
		checks = numbers.nextDouble();
		
		if (checks >= 20 && checks <= 39) {
			
			total = (checks * 0.08) + 10;
			
			System.out.println("This month's service fees are $ " + total);
		}
		
		else if (checks < 20) {
			
			total = (checks * 0.10) + 10;
			
			System.out.println("This month's service fees are $ " + total);
		}
		
		else if (checks >= 40 && checks <= 50) {
			
			total = (checks * .06) + 10;
			
			System.out.println("This month's service fees are $ " + total);
		}
		
		else if (checks >= 60 ) {
			
			total = (checks * .04) + 10;
			
			System.out.println("This month's service fees are $ " + total);
		}
		
	}
}
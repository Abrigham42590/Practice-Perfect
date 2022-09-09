import java.util.Scanner;

public class ConversionProgram {
	public static void main(String[] args) {
		menu();
	}
	
	public static void showKilometers(double meters) {
		double kilometers;
		
		kilometers = meters * 0.001;
		
		System.out.printf("%.01f",kilometers);
	}
	
	public static void showInches(double meters) {
		double inches;
		
		inches = meters * 39.37;
		
		System.out.printf("%.01f",inches);
	}
	
	public static void showFeet(double meters) {
		double feet;
		
		feet = meters * 3.281;
		
		System.out.printf("%.01f",feet);
	}
	
	public static void menu() {
		
		double meters;
		
		@SuppressWarnings("resource")
		Scanner metersin = new Scanner(System.in);
		
		System.out.print("Enter your distance in meters:\n");
		meters = metersin.nextDouble();
		
		int choice = 0;
		while (choice != 4) {
			
			
			if (meters < 1) {
				System.out.print("Please only use positive numbers\n");
				continue;
			}
			
			System.out.print("1. Convert to kilometers\n");
			System.out.print("2. Convert to inches\n");
			System.out.print("3. Convert to feet\n");
			System.out.print("4. Quit the program\n");
			
			System.out.print("");
			choice = metersin.nextInt();
			
			if (choice == 1) {
				System.out.printf("%.0f", meters);
				System.out.print(" meters is ");
				showKilometers(meters);
				System.out.print(" kilometers.\n");
				System.out.print("\n");
			}
			
			else if (choice == 2) {
				System.out.printf("%.0f", meters);
				System.out.print(" meters is " );
				showInches(meters);
				System.out.print(" inches.\n");
				System.out.print("\n");
			}
			
			else if (choice == 3) {
				System.out.printf("%.0f", meters);
				System.out.print(" meteres is ");
				showFeet(meters);
				System.out.print(" feet.\n");
				System.out.print("\n");
			}
			
			else if (choice > 4 || choice < 1) {
				System.out.print("Invalid choice, Reenter a valid choice\n");
			}
			
			else if (choice == 4) {
				System.out.print("Thank you, the program will now end");
			}
			
		}
	}
}

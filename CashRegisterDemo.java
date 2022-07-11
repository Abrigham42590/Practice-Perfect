import java.util.Scanner;

public class CashRegisterDemo {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner number = new Scanner(System.in);
		
		double nitems, costs, units;
		
		String items;
		
		int count = 0; 
		
		System.out.print("We need information about the retail item.\n");
		
		System.out.print("What is the name of the item? ");
		items = number.nextLine();
		
		System.out.print("How many units are available? ");
		units = number.nextDouble();
		
		while (count != 100) {
			
			if (units < 0) {
				System.out.println("Invalid Entry. Please try again.");
				units = number.nextDouble();
			}
			
			else
				break;
		}
		
		
		System.out.print("How much does the item cost per unit? ");
		costs = number.nextDouble();
		
		while (count != 1000) {
			if (costs <= 0) {
				System.out.println("Invalid Entry. Please try again.");
				costs = number.nextDouble();
				}
			else
				break;
		}
		
		System.out.print("How many items are you going to purchase? ");
		nitems = number.nextDouble();
		
		while (count != 10000000) {
			if (nitems <= 0) {
				System.out.println("Invalid Entry. Please try again.");
				nitems = number.nextDouble();
			}
			else
				break;
		}
		
		CashRegister info = new CashRegister(nitems, items, costs);
		
		System.out.println("Subtotal: " + info.getSubTotal());
		
		System.out.print("Tax: ");
		System.out.printf("%.1f\n",info.getTax());
		
		System.out.println("Total: " + info.getTotal());
		
	}
}
import java.util.Scanner;
public class PayRollExceptions {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner words = new Scanner(System.in);
		
		String name;
		
		String idnumber;
		
		double hourlypay, hoursworked;
		
		System.out.print("Enter the employee's name: ");
		name = words.nextLine();
		
		System.out.print("Enter employee number, (ex. 999-M): ");
		idnumber = words.nextLine();
		
		System.out.print("Enter the employee's hourly rate: ");
		hourlypay = words.nextDouble();
		
		System.out.print("Enter the number of hours the employee has worked: ");
		hoursworked = words.nextDouble();

		PayRolls paid = new PayRolls(name, idnumber, hourlypay, hoursworked);
		
		
		if (hourlypay < 0 || hourlypay > 25) {
			try {
				paid.getError();
			}
			catch(InvalidRate e) {
				System.out.print(e.getMessage());
			}
		}
		
		else if(idnumber.equals("9999") || idnumber.equals("999-N") || idnumber.equals("999")) {
			try {
				paid.getError2();
			}
			catch(InvalidValue e) {
				System.out.print(e.getMessage());
			}
		}
		
		else if(hoursworked < 0 || hoursworked > 25) {
			try {
				paid.getError3();
			}
			catch(InvalidHours e) {
				System.out.print(e.getMessage());
			}
		}
		
		else if(hoursworked > 0) {
			System.out.println("Employees name: " + paid.getEmployees()); 
		    System.out.println("ID: " + paid.getIDnumber());
		    System.out.println("Hourly Rate: $" + paid.getHourlyPayRates());
		    System.out.print("Hours: "); 
		    System.out.printf("%.0f",paid.getNumberofHoursWorked());
		    System.out.print(" hrs \n");
		    System.out.println("Gross Pay: $" + paid.getgrosspay(hourlypay, hoursworked));
		}
		
		
	}
}

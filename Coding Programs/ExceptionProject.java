import java.util.Scanner;

public class ExceptionProject {
	public static void main(String[] args) {
		
		String name, number, date;
		int shift;
		double payrate;
		
		@SuppressWarnings("resource")
		Scanner words = new Scanner(System.in);
		
		System.out.print("Enter employee name: ");
		name = words.nextLine();
		
		System.out.print("Enter employee number, (ex. 999-M): ");
		number = words.nextLine();
		
		System.out.print("Enter employee hire date: ");
		date = words.nextLine();
		
		System.out.print("Employee shift, (1 = day or 2 = night): ");
		shift = words.nextInt();
		
		System.out.print("Enter employee hourly pay rate: ");
		payrate = words.nextDouble();
		
		ProductionWorker info = new ProductionWorker(shift, payrate);
		Employee infoe = new Employee(name, number, date);
		
	if (payrate < 0) {
			try {
				info.getError();
			} catch (InvalidPayRate e) {
				System.out.print(e.getMessage());
			}
		}
	else if(shift <= 0) {
		try {
			info.getError2();
		} catch (InvalidShift e) {
			System.out.print(e.getMessage());
		}
	}
	else if(number.equals("999-N")) {
		try {
			infoe.getError3();
		} catch (InvalidEmployeeNumber e) {
			System.out.print(e.getMessage());
		}
	}
	else
		System.out.println("Employee Details");
	    System.out.println("Employees name: " + infoe.getName());
	    System.out.println("Employee Number: " + infoe.getNumber());
		System.out.println("Hire Date: " + infoe.getDate());
	    System.out.println("Shift: " + info.getShift());
	    System.out.println("Hourly Pay Rate: $" + info.getPayRate());
	}
	}

	


		
	

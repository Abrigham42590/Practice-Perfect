import java.util.Scanner;

public class ParkingCarSimulator {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner words = new Scanner(System.in);
		
		String officername, numberofminutes, numberofminutesmeter, carmake, model, color, licensenumber, badgenumber;
		
		int fine = 25, count = 0;

		System.out.print("Enter the officer's name\n");
		officername = words.nextLine();
		
		System.out.print("Enter officer's badge number\n");
		badgenumber = words.nextLine();
		
		System.out.print("Enter the car's make\n");
		carmake = words.nextLine();
		
		System.out.print("Enter the car's model\n");
		model = words.nextLine();
		
		System.out.print("Enter the car's color\n");
		color = words.nextLine();
		
		System.out.print("Enter the car's liscense number\n");
		licensenumber = words.nextLine();
		
		System.out.print("Enter Minutes on car\n");
		numberofminutes = words.nextLine();
		
		while (count != 100) {
			
			if (numberofminutes.equals("-50")) {
				System.out.println("Invalid Entry. Please try again.");
				numberofminutes = words.nextLine();
			}
			
			else 
				break;
		}
		
		
		System.out.println("Enter the number of minutes purchased on the meter");
		numberofminutesmeter = words.nextLine();
		
		if (numberofminutesmeter.equals("-5")) {
			System.out.println("Invalid Entry. Please try again.");
			numberofminutesmeter = words.nextLine();
		}
		
		
		
		TheParkedCar infoTheParkedCar = new TheParkedCar(carmake, model, color, licensenumber, numberofminutes);
		@SuppressWarnings("unused")
		TheParkingMeter infoTheParkingMeter = new TheParkingMeter(numberofminutesmeter);
		ThePoliceOfficer infoThePoliceOfficer = new ThePoliceOfficer(officername, badgenumber);
		TheParkingTicket infoTheParkingTicket = new TheParkingTicket(infoTheParkedCar, infoThePoliceOfficer, fine);
		
		if (numberofminutesmeter.equals("30") || numberofminutesmeter.equals("50")) {
			System.out.print("Car parking time has expired. \n");
			System.out.print(infoTheParkingTicket);
		}
		
		if (numberofminutes.equals("50")) {
			System.out.print("The Car parking time has expired. \n");
			System.out.print(infoTheParkingTicket);
		}
		
		else if (numberofminutes.equals("30"))
			System.out.print("The car parking minutes are valid\n");
	}
}

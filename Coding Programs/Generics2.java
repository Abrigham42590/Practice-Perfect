import java.util.Scanner;

public class Generics2 {
	
	
	public static void main(String[] args) {
		
		
	
		final Integer EAGE = 3;
		final Integer SIZE = 3;
		String[] enames = new String[SIZE];
		String[] eages = new String[EAGE];
		String[] cpopulation = new String[SIZE];
		String[] cityname = new String[SIZE];
		
		
		@SuppressWarnings("resource")
		Scanner number = new Scanner(System.in);
		
		for (Integer value = 0; value < 3; value++) {
			
			System.out.println("");
			
			System.out.println("Collecting Employee" + (value + 1) + " Information");
			
			System.out.println("");
			
			
			System.out.print("Please enter Employee" + (value + 1) + " name: \n");
			enames[value] = number.nextLine();
			
			System.out.print("Please enter Employee" + (value + 1) + " Age: \n");
			eages[value] = number.nextLine();
			
			
		}
		
		
		for (int count = 0; count < 3; count++) {
			
			System.out.println("");
			
			System.out.println("Collecting City" + (count + 1) + " Information");
			
			System.out.println("");
			
			System.out.print("Please enter City" + (count + 1) + " name: \n ");
			cityname[count] = number.nextLine();
			
			System.out.print("Please enter City" + (count + 1) + " population: \n ");
			cpopulation[count] = number.nextLine();
			
		}
		
		HighestandLowest<String> HL = new HighestandLowest<>(eages, enames, cpopulation, cityname);
		
		
		
	}
		
		
	}

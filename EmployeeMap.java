import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class EmployeeMap {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner number = new Scanner(System.in);
		
		int count = 10;
		
		Map<Integer, Employee2> Employee2Map2 = new HashMap<>();
		Set<Employee2> Employee2Map = new HashSet<>();
		
		Employee2 one = new Employee2(1, "Eason");
		Employee2 two = new Employee2(2, "Lisa");
		Employee2 three = new Employee2(3, "Anna");
		Employee2 four = new Employee2(4,"Olivia");
		Employee2 five = new Employee2(5, "Madelyn");
		Employee2 six = new Employee2(6, "Sam");
		Employee2 seven = new Employee2(7, "Will");
		Employee2 eight = new Employee2(8, "Johnson");
		
		Employee2Map.add(new Employee2(1, "Eason"));
		Employee2Map.add(new Employee2(2, "Lisa"));
		Employee2Map.add(new Employee2(3, "Anna"));
		Employee2Map.add(new Employee2(4,"Olivia"));
		Employee2Map.add(new Employee2(5, "Madelyn"));
		Employee2Map.add(new Employee2(6, "Sam"));
		Employee2Map.add(new Employee2(7, "Will"));
		Employee2Map.add(new Employee2(8, "Johnson"));
		
		
		Employee2Map2.put(one.getId(), one);
		Employee2Map2.put(two.getId(), two);
		Employee2Map2.put(three.getId(), three);
		Employee2Map2.put(four.getId(), four);
		Employee2Map2.put(five.getId(), five);
		Employee2Map2.put(six.getId(), six);
		Employee2Map2.put(seven.getId(), seven);
		Employee2Map2.put(eight.getId(), eight);
		
		
		
		while(count > 0) {
			
			System.out.print("Please enter the Employee2 ID or Negative Number to Exit: " );
			count = number.nextInt();

			
			if (count == 1) {
				Set<Map.Entry<Integer, Employee2>> entries = Employee2Map2.entrySet();
				for(Map.Entry<Integer, Employee2> entry : entries) {
					if (entry.getKey() == count) {
						System.out.println("This Employee2 is: " + one.getEname());
					}
				}
			}
			
			else if (count == 2) {
				Set<Map.Entry<Integer, Employee2>> entries = Employee2Map2.entrySet();
				for(Map.Entry<Integer, Employee2> entry : entries) {
					if(entry.getKey() == count); {
						System.out.println("This Employee2 is " + two.getEname());
					}
				}
			}
			
			else if (count == 3) {
				Set<Map.Entry<Integer, Employee2>> entries = Employee2Map2.entrySet();
				for(Map.Entry<Integer, Employee2> entry : entries) {
					if(entry.getKey() == count) {
						System.out.println("This Employee2 is: " + three.getEname());
					}
				}
			}
			
			else if (count == 4) {
				Set<Map.Entry<Integer, Employee2>> entries = Employee2Map2.entrySet();
				for(Map.Entry<Integer, Employee2> entry : entries) {
					if(entry.getKey() == count) {
						System.out.println("This Employee2 is: " + four.getEname());
					}
				}
			}
			
			else if (count == 5) {
				Set<Map.Entry<Integer, Employee2>> entries = Employee2Map2.entrySet();
				for(Map.Entry<Integer, Employee2> entry : entries) {
					if(entry.getKey() == count) {
						System.out.println("This Employee2 is: " + five.getEname());
					}
				}
			}
			
			else if (count == 6) {
				Set<Map.Entry<Integer, Employee2>> entries = Employee2Map2.entrySet();
				for(Map.Entry<Integer, Employee2> entry : entries) {
					if(entry.getKey() == count) {
						System.out.println("This Employee2 is " + six.getEname());
					}
				}
			}
			
			else if (count == 7) {
				Set<Map.Entry<Integer, Employee2>> entries = Employee2Map2.entrySet();
				for(Map.Entry<Integer, Employee2> entry : entries) {
					if(entry.getKey() == count) {
						System.out.println("This Employee2 is: " + seven.getEname());
					}
				}
			}
			
			else if (count == 8) {
				Set<Map.Entry<Integer, Employee2>> entries = Employee2Map2.entrySet();
				for(Map.Entry<Integer, Employee2> entry : entries) {
					if(entry.getKey() == count) {
						System.out.println("This Employee is: " + eight.getEname());
					}
				}
			}
			
			else if (count == 0 || count > 8) {
				System.out.println("This Employee id doesn't exist!");
				System.out.println("");
			}
			
			else if(count < 1) {
				System.out.println("Exiting the program!");
				System.out.println("");
				break;
			}
			
			count++;
			
			
		}
		
		
		
	}
	
		
	

	
	
}
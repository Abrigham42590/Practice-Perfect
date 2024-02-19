import java.util.Scanner;
public class QueueLinkedListDemo {
	
	public static void main (String[] args) throws EmptyQueneException2 {
		
	Scanner number = new Scanner(System.in);

	
	String names1, numbers2, numbers;
	
	int counting = 0;
	
	
	LinkedListQuene<Object> quene = new LinkedListQuene<>();
	
	String [] names = {
	"Alfonso", "Bob", "Carol", "Deborah", "Elaine"
	};
	
	String [] numbers1 = {
	"15", "17", "21", "18", "22"
	};
	
	for(String s: names) {
	  quene.enqueue(s);
	}
	
	for(String n: numbers1) {
		quene.enqueue2(n);
	}
	
	System.out.println("");
	System.out.println("State of Queue: ");
	System.out.print(quene);
	
	menu();
	do {
		
		System.out.print("Please enter selection: ");
		numbers = number.nextLine();
		
		System.out.println("");
		
		if (numbers.equals("1")) {
			System.out.println("Employee Name: ");
			names1 = number.nextLine();
			
			quene.enqueue(names1);
			
			System.out.println("Employee Hourly Wage: ");
			numbers2 = number.nextLine();
			
			System.out.println("");
			quene.enqueue2(numbers2);
			
			System.out.println("State of Queue:"); 
			
			System.out.print(quene);
			menu();
			
		}
		
		else if (numbers.equals("2")) {
			
			try {
				quene.dequene();
			} catch (EmptyQueneException e) {
				System.out.print(e.getMessage());
				
			}
			
			try {
				quene.dequene2();
			} catch (EmptyQueneException2 e) {
				System.out.print(e.getMessage());

			}
			
			System.out.println("");
			System.out.println("State of Queue:");
			
			System.out.print(quene);
			menu();
			
		}
		
		else if (numbers.equals("3")) {
			System.out.println("Thank you, goodbye!");
			break;
		}
	
	} while (counting != 3);
		
	
	}
	
	public static void menu() {

		int numbers;
		Scanner number = new Scanner(System.in);
		
		System.out.println("");
		System.out.println("QUEUE MENU");
		System.out.println("1: Add Entry (enqueue)");
		System.out.println("2: Remove Entry (dequeue)");
		System.out.println("3: QUIT");
		
	}
	
	
	
	
	
}

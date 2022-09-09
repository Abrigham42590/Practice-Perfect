import java.util.Scanner;

public class CustomerDemo {
	public static void main(String[] args) {
		
		String name, address, telephonenumber;
		
		int customerid;
		
		
		@SuppressWarnings("resource")
		Scanner words = new Scanner(System.in);
		
		System.out.print("Enter customer Name: ");
		name = words.nextLine();
		
		System.out.print("Enter customer Address: ");
		address = words.nextLine();
		
		System.out.print("Enter customer Telephone Number: ");
		telephonenumber = words.nextLine();
		
		System.out.print("Enter CustID: ");
		customerid = words.nextInt();
		
		Customer info = new Customer(name, address, telephonenumber, customerid);
		
				
		System.out.print("Cust Name:" + info.getname() + "\n");
		System.out.print("CustID: " + info.getnumber() + "\n");
		System.out.print("Telephone Number: " + info.getphonenumber() + "\n");
		System.out.print("Mail List Status: " + info.getmailinglist() + "\n");
		
	
		
		
	}
}

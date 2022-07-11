import java.util.Scanner;

public class Multiply
{

public static void main(String[] args) {
	
	int xvalue, yvalue;
	
	@SuppressWarnings("resource")
	Scanner answer = new Scanner(System.in);
	
	System.out.print("Enter a number: ");
	xvalue = answer.nextInt();
	
	System.out.print("Enter another number (to multiply): ");
	yvalue = answer.nextInt();
	
	System.out.println(xvalue + " times " + yvalue + " is " + recursion(xvalue, yvalue));
	

	
}


public static int recursion(int x, int y) {
	
		if (x == 0 && y > 0 || y < 0) {
			return 0;
		}
		
		else if (x == 0 && y == 0) {
			return 0;
		}
		
		else if (y == 0 && x > 0 || x < 0) {
			return 0;
		}
		
		else if (y > x) {
			return y + recursion(x - 1, y);
		}
		
		else 
		   return x + recursion(x - 1, y);

	
}


}

import java.util.ArrayList;
import java.util.Scanner;
public class MyList <T> implements Comparable<Number> {
	
	private final int SIZE = 4;
	private T[] ArrayList;
	private String[] ArrayList2 = new String[SIZE];
	
	
	public MyList(T[] numbers) {
		
		Title();
		AddIntegers(numbers);
		Largest();
		Smallest();
		LargestD();
		SmallestD();
		UserInput();
		showStringNumber();
		showStringName();
		
		
		
	}
	
	public void Title() {
		System.out.println("PART 1");
	}
	
	public void UserInput() {
		
		System.out.println("PART 2");
		
		@SuppressWarnings("resource")
		Scanner names = new Scanner(System.in);
		
		System.out.println("Please enter a number: ");
		ArrayList2[0] = names.nextLine();
		
		System.out.println("Please another number: ");
		ArrayList2[1] = names.nextLine();
		
		System.out.println("Please enter your name: ");
		ArrayList2[2] = names.nextLine();
		
		System.out.println("Please enter your City: ");
		ArrayList2[3] = names.nextLine();
		
		
	}
	

	
	public void AddIntegers(T[] AL) {
		
		ArrayList = AL;
		

	}
	

	
	
	@SuppressWarnings("unchecked")
	public void Largest() {
		
		if(((Comparable<Number>) ArrayList[0]).compareTo((Number) ArrayList[1]) > 0 
		&& ((Comparable<Number>) ArrayList[0]).compareTo ((Number) ArrayList[2]) > 0 &&
		((Comparable<Number>) ArrayList[0]).compareTo((Number) ArrayList[3]) > 0 
		&& ((Comparable<Number>) ArrayList[0]).compareTo((Number) ArrayList[4]) > 0) {
			System.out.println("The Integer largest: ");
			System.out.println(ArrayList[0]);
		}
		
		else if(((Comparable<Number>) ArrayList[1]).compareTo((Number) ArrayList[0]) > 0 
			 && ((Comparable<Number>) ArrayList[1]).compareTo ((Number) ArrayList[2]) > 0 &&
				((Comparable<Number>) ArrayList[1]).compareTo((Number) ArrayList[3]) > 0 
				&& ((Comparable<Number>) ArrayList[1]).compareTo((Number) ArrayList[4]) > 0) {
			System.out.println("The Integer largest: ");		
			System.out.println(ArrayList[1]);
				}
		
		else if(((Comparable<Number>) ArrayList[2]).compareTo((Number) ArrayList[0]) > 0 
				&& ((Comparable<Number>) ArrayList[2]).compareTo ((Number) ArrayList[1]) > 0 &&
				((Comparable<Number>) ArrayList[2]).compareTo((Number) ArrayList[3]) > 0 
				&& ((Comparable<Number>) ArrayList[2]).compareTo((Number) ArrayList[4]) > 0) {
			System.out.println("The Integer largest: ");		
			System.out.println(ArrayList[2]);
				}
		
		else if(((Comparable<Number>) ArrayList[3]).compareTo((Number) ArrayList[0]) > 0
			   && ((Comparable<Number>) ArrayList[3]).compareTo ((Number) ArrayList[1]) > 0 &&
				((Comparable<Number>) ArrayList[3]).compareTo((Number) ArrayList[2]) > 0 
				&& ((Comparable<Number>) ArrayList[3]).compareTo((Number) ArrayList[4]) > 0) {
			System.out.println("The Integer largest: ");		
			System.out.println(ArrayList[3]);
				}
		

		else if(((Comparable<Number>) ArrayList[4]).compareTo((Number) ArrayList[0]) > 0
			   && ((Comparable<Number>) ArrayList[4]).compareTo ((Number) ArrayList[1]) > 0 &&
				((Comparable<Number>) ArrayList[4]).compareTo((Number) ArrayList[2]) > 0 
				&& ((Comparable<Number>) ArrayList[4]).compareTo((Number) ArrayList[3]) > 0) {
			System.out.println("The Integer largest: ");			
			System.out.println(ArrayList[4]);
				}
		
		
		
	}
	
	@SuppressWarnings("unchecked")
	public void Smallest() {
		
		
		if(((Comparable<Number>) ArrayList[0]).compareTo((Number) ArrayList[1]) < 0 
		&& ((Comparable<Number>) ArrayList[0]).compareTo ((Number) ArrayList[2]) < 0 &&
		((Comparable<Number>) ArrayList[0]).compareTo((Number) ArrayList[3]) < 0 
		&& ((Comparable<Number>) ArrayList[0]).compareTo((Number) ArrayList[4]) < 0) {
			System.out.println("The Integer smallest: ");
			System.out.println(ArrayList[0]);
		}
		
		else if(((Comparable<Number>) ArrayList[1]).compareTo((Number) ArrayList[0]) < 0 
			 && ((Comparable<Number>) ArrayList[1]).compareTo ((Number) ArrayList[2]) < 0 &&
				((Comparable<Number>) ArrayList[1]).compareTo((Number) ArrayList[3]) < 0 
				&& ((Comparable<Number>) ArrayList[1]).compareTo((Number) ArrayList[4]) < 0) {
			System.out.println("The Integer smallest: ");		
			System.out.println(ArrayList[1]);
				}
		
		else if(((Comparable<Number>) ArrayList[2]).compareTo((Number) ArrayList[0]) < 0 
				&& ((Comparable<Number>) ArrayList[2]).compareTo ((Number) ArrayList[1]) < 0 &&
				((Comparable<Number>) ArrayList[2]).compareTo((Number) ArrayList[3]) < 0 
				&& ((Comparable<Number>) ArrayList[2]).compareTo((Number) ArrayList[4]) < 0) {
			System.out.println("The Integer smallest: ");		
			System.out.println(ArrayList[2]);
				}
		
		else if(((Comparable<Number>) ArrayList[3]).compareTo((Number) ArrayList[0]) < 0
			   && ((Comparable<Number>) ArrayList[3]).compareTo ((Number) ArrayList[1]) < 0 &&
				((Comparable<Number>) ArrayList[3]).compareTo((Number) ArrayList[2]) < 0 
				&& ((Comparable<Number>) ArrayList[3]).compareTo((Number) ArrayList[4]) < 0) {
			System.out.println("The Integer smallest: ");		
			System.out.println(ArrayList[3]);
				}
		

		else if(((Comparable<Number>) ArrayList[4]).compareTo((Number) ArrayList[0]) < 0
			   && ((Comparable<Number>) ArrayList[4]).compareTo ((Number) ArrayList[1]) < 0 &&
				((Comparable<Number>) ArrayList[4]).compareTo((Number) ArrayList[2]) < 0 
				&& ((Comparable<Number>) ArrayList[4]).compareTo((Number) ArrayList[3]) < 0) {
			System.out.println("The Integer smallest: ");		
			System.out.println(ArrayList[4]);
				}
		
	}
	
	@SuppressWarnings("unchecked")
	public void LargestD() {
		
		if(((Comparable<Number>) ArrayList[5]).compareTo((Number) ArrayList[6]) > 0 
				&& ((Comparable<Number>) ArrayList[5]).compareTo ((Number) ArrayList[7]) > 0 &&
				((Comparable<Number>) ArrayList[5]).compareTo((Number) ArrayList[8]) > 0 
				&& ((Comparable<Number>) ArrayList[5]).compareTo((Number) ArrayList[9]) > 0) {
					System.out.println("The Double largest: ");
					System.out.println(ArrayList[5]);
				}
				
				else if(((Comparable<Number>) ArrayList[6]).compareTo((Number) ArrayList[5]) > 0 
					 && ((Comparable<Number>) ArrayList[6]).compareTo ((Number) ArrayList[7]) > 0 &&
						((Comparable<Number>) ArrayList[6]).compareTo((Number) ArrayList[8]) > 0 
						&& ((Comparable<Number>) ArrayList[6]).compareTo((Number) ArrayList[9]) > 0) {
					System.out.println("The Double largest: ");		
					System.out.println(ArrayList[6]);
						}
				
				else if(((Comparable<Number>) ArrayList[7]).compareTo((Number) ArrayList[5]) > 0 
						&& ((Comparable<Number>) ArrayList[7]).compareTo ((Number) ArrayList[6]) > 0 &&
						((Comparable<Number>) ArrayList[7]).compareTo((Number) ArrayList[8]) > 0 
						&& ((Comparable<Number>) ArrayList[7]).compareTo((Number) ArrayList[9]) > 0) {
					System.out.println("The Double largest: ");		
					System.out.println(ArrayList[7]);
						}
				
				else if(((Comparable<Number>) ArrayList[8]).compareTo((Number) ArrayList[5]) > 0
					   && ((Comparable<Number>) ArrayList[8]).compareTo ((Number) ArrayList[6]) > 0 &&
						((Comparable<Number>) ArrayList[8]).compareTo((Number) ArrayList[7]) > 0 
						&& ((Comparable<Number>) ArrayList[8]).compareTo((Number) ArrayList[9]) > 0) {
					System.out.println("The Double largest: ");		
					System.out.println(ArrayList[8]);
						}
				

				else if(((Comparable<Number>) ArrayList[9]).compareTo((Number) ArrayList[5]) > 0
					   && ((Comparable<Number>) ArrayList[9]).compareTo ((Number) ArrayList[6]) > 0 &&
						((Comparable<Number>) ArrayList[9]).compareTo((Number) ArrayList[7]) > 0 
						&& ((Comparable<Number>) ArrayList[9]).compareTo((Number) ArrayList[8]) > 0) {
					System.out.println("The Double largest: ");			
					System.out.println(ArrayList[9]);
						}
				
		
	}
	
	@SuppressWarnings("unchecked")
	public void SmallestD() {
		
		if(((Comparable<Number>) ArrayList[5]).compareTo((Number) ArrayList[6]) < 0 
				&& ((Comparable<Number>) ArrayList[5]).compareTo ((Number) ArrayList[7]) < 0 &&
				((Comparable<Number>) ArrayList[5]).compareTo((Number) ArrayList[8]) < 0 
				&& ((Comparable<Number>) ArrayList[5]).compareTo((Number) ArrayList[9]) < 0) {
					System.out.println("The Double smallest: ");
					System.out.println(ArrayList[5]);
				}
				
				else if(((Comparable<Number>) ArrayList[6]).compareTo((Number) ArrayList[5]) < 0 
					 && ((Comparable<Number>) ArrayList[6]).compareTo ((Number) ArrayList[7]) < 0 &&
						((Comparable<Number>) ArrayList[6]).compareTo((Number) ArrayList[8]) < 0 
						&& ((Comparable<Number>) ArrayList[6]).compareTo((Number) ArrayList[9]) < 0) {
					System.out.println("The Double smallest: ");		
					System.out.println(ArrayList[6]);
						}
				
				else if(((Comparable<Number>) ArrayList[7]).compareTo((Number) ArrayList[5]) < 0 
						&& ((Comparable<Number>) ArrayList[7]).compareTo ((Number) ArrayList[6]) < 0 &&
						((Comparable<Number>) ArrayList[7]).compareTo((Number) ArrayList[8]) < 0 
						&& ((Comparable<Number>) ArrayList[7]).compareTo((Number) ArrayList[9]) < 0) {
					System.out.println("The Double smallest: ");		
					System.out.println(ArrayList[7]);
						}
				
				else if(((Comparable<Number>) ArrayList[8]).compareTo((Number) ArrayList[5]) < 0
					   && ((Comparable<Number>) ArrayList[8]).compareTo ((Number) ArrayList[6]) < 0 &&
						((Comparable<Number>) ArrayList[8]).compareTo((Number) ArrayList[7]) < 0 
						&& ((Comparable<Number>) ArrayList[8]).compareTo((Number) ArrayList[9]) < 0) {
					System.out.println("The Double smallest: ");		
					System.out.println(ArrayList[8]);
						}
				

				else if(((Comparable<Number>) ArrayList[9]).compareTo((Number) ArrayList[5]) < 0
					   && ((Comparable<Number>) ArrayList[9]).compareTo ((Number) ArrayList[6]) < 0 &&
						((Comparable<Number>) ArrayList[9]).compareTo((Number) ArrayList[7]) < 0 
						&& ((Comparable<Number>) ArrayList[9]).compareTo((Number) ArrayList[8]) < 0) {
					System.out.println("The Double smallest: ");			
					System.out.println(ArrayList[9]);
						}
		
		System.out.println("");
		
				
		
	}
	
	public void showStringNumber() {
		
		System.out.println("First number is " + ArrayList2[0]);
		System.out.println("First number is " + ArrayList2[1]) ;
		
	}
	
	public void showStringName() {
		
		System.out.println("Name is:  " + ArrayList2[2]);
		System.out.println("City is:  " + ArrayList2[3]);
		
	}
	
	


	@Override
	public int compareTo(Number o) {
		// TODO Auto-generated method stub
		return 0;
	}



}

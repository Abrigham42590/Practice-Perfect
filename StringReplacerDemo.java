import java.util.Scanner;



public class StringReplacerDemo {
	
	private static String word;
	private static int count = 0;
	
	
	
	public static void main(String[] args) {
		
		
		@SuppressWarnings("resource")
		Scanner letters = new Scanner(System.in);
		
	
		System.out.print("Enter a word or sentence: ");
		word = letters.nextLine();
		
		
		System.out.println( word + " would be " + characterreplace(word));
		
		if (count > 0) {
			System.out.println("Number of characters replaced " + count);
		}
		
	}
	
	public static String characterreplace(String word) {
		
		
		if (word.isEmpty()) {
			return "";
		}
		
		char a = word.charAt(0);
		
		if (a == 'a') {
			a = 'e';
			count++;		
		}
		
		else if (a == 'e') {
			a = 'i';
			count++;
		}
		
		else if (a == 'i') {
			a = 'o';
			count++;		
		}
		
		else if (a == 'o') {
			a = 'u';
			count++;
		}
		
		else if (a == 'u') {
			a = 'a';
			count++;
		}
		
		return a + characterreplace(word.substring(1));
		
	}
	


		
	}
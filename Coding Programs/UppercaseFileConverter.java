import java.util.Scanner;
import java.io. *;

public class UppercaseFileConverter {
	
	public static void main(String[] args) throws IOException {
	
		@SuppressWarnings({ "resource" })
		Scanner words = new Scanner(System.in);
		
		
		System.out.print("Enter the name of the file to be read:\n");
		String filename = words.nextLine();
		
		File file = new File(filename);
		
		if (file.exists()) {
			System.out.print("Here is the file converted into Uppercase.\n");
		}
	
		else if (!file.exists()) {
			System.out.print("The file " + file + " does not exist or could not be opened.");
			System.exit(0);
		}
		
		Scanner inputFile = new Scanner(file);
		
		while(inputFile.hasNext()) {
			String line1 = inputFile.nextLine();
			
			System.out.println(line1.toUpperCase());
		}
		
		System.out.println("Files read, converted and then closed.");
		
		
		inputFile.close();
		
	}
}

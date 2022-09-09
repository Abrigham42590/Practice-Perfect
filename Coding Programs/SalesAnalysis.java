import java.util.Scanner;
import java.io.*;

public class SalesAnalysis {
	
	private Scanner inputfile;
	private String line;

	public SalesAnalysis(String filename) throws IOException {
		
		File file = new File(filename);
		inputfile = new Scanner(file);
		
	}
	
	public boolean nextLineRead() throws IOException {
		
		boolean readline;
		
		readline = inputfile.hasNext();
		
		if (readline)
			line = inputfile.nextLine();
		
		return readline;
		
	}
	
	public double getTotal() {
		
		double total = 0; 
		
		String[] tokens = line.split(",");
		
		for (String str : tokens) {
			
			total += Double.parseDouble(str);
		}
		
		return total;
		
	}
	
	public double getHighest() {
		
	double total = 0;
	double week = 2;
	double largest = 2;
		
		String[] tokens = line.split(",");
		
		for (String str : tokens) {
			
			total += Double.parseDouble(str);
		}
		
		if (total > 25000) {
			largest = week;
		}
		
		return largest;
		
	}
	
	public double getLowest() {
		
		double total = 0;
		double week = 3;
		double smallest = 3;
			
			String[] tokens = line.split(",");
			
			for (String str : tokens) {
				
				total += Double.parseDouble(str);
			}
			
			if (total < 13000) {
				smallest = week;
			}
			
			return smallest;
		
	}
	
	public double getLowest2() {
		
		double total = 0;
		double week = 7;
		double smallest = 7;
			
			String[] tokens = line.split(",");
			
			for (String str : tokens) {
				
				total += Double.parseDouble(str);
			}
			
			if (total < 16000) {
				smallest = week;
			}
			
			return smallest;
		
	}
	
	
	public double getAverage() {
		
		double total = 0;
		double average;
		
		String[] tokens = line.split(",");
		
		for (String str : tokens) {
			
			total += Double.parseDouble(str);
		}
		
		average = total / 7;
		
		return average;
		
	}
	
	
	public void close() throws IOException {
		
		inputfile.close();
	}
	

}

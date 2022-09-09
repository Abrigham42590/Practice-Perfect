import java.io.*;
public class SalesAnalysisDemo {
	public static void main(String[] args) throws IOException {
		
		double average, total, finaltotal = 0;
		int weeknumber = 1;
		
	
		SalesAnalysis analyze = new SalesAnalysis("SalesData.txt");
		
		while (analyze.nextLineRead()) {
			
			average = analyze.getAverage();
			total = analyze.getTotal();
			
			System.out.print("Weekly sales from week " + weeknumber + " is $");
			System.out.printf("%.2f\n", total);
			System.out.print("Average for week " + weeknumber + " is $");
			System.out.printf("%.2f\n", average);
			
			
			finaltotal += total;
			weeknumber++;
		}
		
		
		
		if (weeknumber == 10) {
			System.out.print("Total sale of all weeks = ");
			System.out.printf("%.2f\n", finaltotal);
			System.out.print("Average weekly sales = "); 
			System.out.printf("%.2f\n", (finaltotal / 10));
			System.out.print("The week number with the highest amount of sales is: ");
			System.out.printf("%.0f\n", analyze.getHighest());
			System.out.print("The week number with the lowest amount of sales is: ");
			System.out.printf("%.0f\n", analyze.getLowest2());
		}
			
		else if (weeknumber != 10) {
			System.out.print("Total sale of all weeks = ");
			System.out.printf("%.2f\n", finaltotal);
			System.out.print("Average weekly sales = "); 
			System.out.printf("%.2f\n", (finaltotal / 6));;
			System.out.print("The week number with the highest amount of sales is: ");
			System.out.printf("%.0f\n", analyze.getHighest());
			System.out.print("The week number with the lowest amount of sales is: ");
			System.out.printf("%.0f\n", analyze.getLowest());
		}
		
		
		analyze.close();
		
		
	}
}

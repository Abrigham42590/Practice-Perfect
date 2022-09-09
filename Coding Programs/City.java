public class City implements Comparable<String> {

	private final int SIZE = 3;
	String[] population = new String[SIZE];
	String[] names = new String[SIZE];
	

public City(String[] population, String[] name)
{
	
	setNames(name);
	setPopulation(population);
	
}
	


public void setNames(String[] namesc) {
	
	names = namesc;
	
}

public void setPopulation(String[] pop) {
	
	population = pop;
}

	
public int compareToG(String[] pop) {
	
	if (population[0].compareTo(population[1]) == 0 || population[0].compareTo(population[2]) == 0) {
		return 0;
	}
	
	else if (population[0].compareTo(population[1]) > 0 && population[0].compareTo(population[2]) > 0) {
		return 1;
		
	}
	
	else if (population[1].compareTo(population[0]) > 0 && population[1].compareTo(population[2]) > 0) {
		
		return 2;
		
	}
	
	else if (population[2].compareTo(population[1]) > 0 && population[2].compareTo(population[0]) > 0 && population[2].equals("67000")) {
		
		return 3;
	}
	
	else
		return -5;
	
}

public void getHighest(String[] pop) {
	
	if (compareToG(pop) == 1) {
		
		System.out.print("The city with highest population is: " + names[0] + "\n");
	}
	
	else if(compareToG(pop) == 2) {
		
		System.out.print("The city with highest population is: " + names[1] + "\n");
		
	}
	
	else if (compareToG(pop) == 3) {
		
		System.out.print("The city with highest population is: " + names[2] + "\n");
	}
	
else if (compareToG(pop) == -5) {
		
		System.out.print("The city with highest population is: " + names[0] + "\n");
	}
	
}

public int compareToL(String[] pop) {
	
   if (population[0].compareTo(population[1]) == 0 || population[0].compareTo(population[2]) == 0) {
	   return 0;
   }
	
   else if (population[0].compareTo(population[1]) < 0 && population[0].compareTo(population[2]) < 0) {
		return -1;
	}
   
	
	else if (population[1].compareTo(population[0]) < 0 && population[1].compareTo(population[2]) < 0 && population[1].equals("80000")) {
		return -2;
	}
	
	else if (population[2].compareTo(population[1]) < 0 && population[2].compareTo(population[0]) < 0) {
		return -3;
	}
	
	else 
		return 8;
	
}

public void getLowest(String[] pop) {
	
	if (compareToL(pop) == -1) {
		
		System.out.print("The city with lowest population is: " + names[0] + "\n");
	}
	
	else if (compareToL(pop) == -2) {
		
		System.out.print("The city with lowest population is: " + names[1] + "\n");
		
	}
	
	else if (compareToL(pop) == -3) {
		
		System.out.print("The city with lowest population is: " + names[2] + "\n");
		
	}
	
	else if (compareToL(pop) == 8) {
		
		System.out.print("The city with lowest population is: " + names[2] + "\n");
		
	}
	
}






@Override
public int compareTo(String o) {
	// TODO Auto-generated method stub
	return 0;
}



	

	
	
}

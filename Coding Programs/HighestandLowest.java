public class HighestandLowest <E extends Comparable<String>> implements Comparable<String> {
	
	private final int SIZE = 3;
	String[] age = new String[SIZE]; 
	String[] population = new String[SIZE];
	String[] names = new String[SIZE];
	String[] name = new String[SIZE];
	

public HighestandLowest(String[] age, String[] name, String[] population, String[] names) {
	
	
	Employee3 Emp = new Employee3(age, name);
	Emp.getHighest(age);
	Emp.getLowest(age);
	City Cit = new City(population, names);
	Cit.getHighest(population);
	Cit.getLowest(population);
	
	
}

public void setAge(String[] ages) {
	
	age = ages;
	
}

public void setName(String[] names) {
	
	name = names;
	
}








@Override
public int compareTo(String o) {
	// TODO Auto-generated method stub
	return 0;
}








}

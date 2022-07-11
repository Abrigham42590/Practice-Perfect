public class Employee3 implements Comparable<String> {
	
	private final int SIZE = 3;
	String[] age = new String[SIZE];
	String[] name = new String[SIZE];
	
	public Employee3(String[] age, String[] name)
	{
		
		setName(name);
		setAge1(age);
		
	}
	
	public void setName(String[] names) {
		
		name = names;
		
	}
	
	
	public void setAge1(String[] ages) {
		
		age = ages;
	}
	
	public int compareToG(String[] ages) {
		
		if (age[0].compareTo(age[1]) == 0 || age[0].compareTo(age[2]) == 0) {
			return 0;
		}
		
		else if (age[0].compareTo(age[1]) > 0 && age[0].compareTo(age[2]) > 0) {
			return 1;
			
		}
		
		else if (age[1].compareTo(age[0]) > 0 && age[1].compareTo(age[2]) > 0) {
			
			return 2;
			
		}
		
		else if (age[2].compareTo(age[1]) > 0 && age[2].compareTo(age[0]) > 0) {
			
			return 3;
		}
		
		else
			return -1;
		
	}

	public void getHighest(String[] ages) {
		
		if (compareToG(ages) == 1) {
			
			System.out.print("The oldest employee is: " + name[0] + "\n");
		}
		
		else if(compareToG(ages) == 2) {
			
			System.out.print("The oldest employee is: " + name[1] + "\n");
			
		}
		
		else if (compareToG(ages) == 3) {
			
			System.out.print("The oldest employee is: " + name[2] + "\n");
		}
		
	}

	public int compareToL(String[] ages) {
		
	   if (age[0].compareTo(age[1]) == 0 || age[0].compareTo(age[2]) == 0) {
		   return 0;
	   }
		
	   else if (age[0].compareTo(age[1]) < 0 && age[0].compareTo(age[2]) < 0) {
			return -1;
		}
		
		else if (age[1].compareTo(age[0]) < 0 && age[1].compareTo(age[2]) < 0) {
			return -2;
		}
		
		else if (age[2].compareTo(age[1]) < 0 && age[2].compareTo(age[0]) < 0) {
			return -3;
		}
		
		else 
			return 1;
		
	}

	public void getLowest(String[] ages) {
		
		if (compareToL(ages) == -1) {
			
			System.out.print("The youngest employee is: " + name[0] + "\n");
		}
		
		else if (compareToL(ages) == -2) {
			
			System.out.print("The youngest employee is: " + name[1] + "\n");
			
		}
		
		else if (compareToL(ages) == -3) {
			
			System.out.print("The youngest employee is: " + name[2] + "\n");
			
		}
		
	}


	






@Override
public int compareTo(String o) {
	// TODO Auto-generated method stub
	return 0;
}




}

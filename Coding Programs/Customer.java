public class Customer extends Person {

	private int number;
	private boolean mailinglist = true; 
	
	public Customer (String namescc, String addresscc, String phonenumbercc, int number) {
		super(namescc, addresscc, phonenumbercc);
		setnumber(number);
	}
	
	public int getnumber() {
		return number;
	}

	
	public void setnumber(int numbers) {
		number = numbers;
	}
	
	public boolean getmailinglist() {
		return mailinglist;
	}
	
	
}

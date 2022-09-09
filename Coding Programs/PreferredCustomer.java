public class PreferredCustomer extends Customer {

	private double purchase;
	private double discount1 = .05 * 100;
	private double discount2 = .06 * 100;
	private float discount3 = .07f * 100;
	private double discount4 = .10 * 100;
	
	public PreferredCustomer(String namespc, String addresspc, String phonenumberpc, int number, boolean Ml, double purchases) {
		super(namespc, addresspc, phonenumberpc, number);
		setpurchases(purchases);
		setmailinglist(Ml);
	}
	
	public double getpurchases() {
		return purchase;
	}
	
	public void setpurchases(double purchases) {
		purchase = purchases;
	}
	
	public void setmailinglist(boolean ml) {
		ml = getmailinglist();
	}
	
	public double getdiscount() {
		
		double discount = 0;
		
		if (getpurchases() >= 500 && getpurchases() < 1000) {
			discount = discount1;
		}
		
		else if(getpurchases() >= 1000 && getpurchases() < 1500) {
			discount = discount2; 
		}
		
		else if (getpurchases() >= 1500 && getpurchases() < 2000) {
			discount = discount3; 
		}
		
		else if (getpurchases() >= 2000) {
			discount = discount4;
		}
		
		return discount; 
	}
	
	
	
	public String toString() {
		String str;
		
		str = "Cust Name:" + getname() + "\nCustID: " + getnumber() + 
			  "\nTelephone Number: " + getphonenumber() + "\nMail List Status: " +
			  getmailinglist() + "\nPurchase " + getpurchases() + "\nDiscount Percent " +
			  getdiscount();
			
	    return str;
	}
	
	

}

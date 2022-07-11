public class PreferredCustomerDemo {
	public static void main(String[] args) {
		
		
		PreferredCustomer preferredcustomer1 = new PreferredCustomer("John Adams", "Los Angeles CA", "3235331234", 933, true, 400 );
		System.out.println(preferredcustomer1.toString() + "\n");
		
		PreferredCustomer preferredcustomer2 = new PreferredCustomer("Susan Adams", "Los Angeles CA", "3235331234", 933, true, 600 );
		System.out.println(preferredcustomer2	.toString() + "\n");
		
		PreferredCustomer preferredcustomer3 = new PreferredCustomer("Mary Adams", "Los Angeles CA", "3235331234", 933, true, 1100 );
		System.out.println(preferredcustomer3.toString() + "\n");
		
		PreferredCustomer preferredcustomer4 = new PreferredCustomer("Larry Adams", "Los Angeles CA", "3235331234", 933, true, 1600 );
		System.out.println(preferredcustomer4.toString() + "\n");
		
		PreferredCustomer preferredcustomer5 = new PreferredCustomer("Mony Adams", "Los Angeles CA", "3235331234", 933, true, 2600 );
		System.out.println(preferredcustomer5.toString() + "\n");
	}
}
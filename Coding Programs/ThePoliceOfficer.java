public class ThePoliceOfficer {
	private String name;
	private String badgenumber;

	public ThePoliceOfficer(String name1, String badgen) {
		name = name1;
		badgenumber = badgen;
	}
	
	public ThePoliceOfficer(ThePoliceOfficer object2) {
		name = object2.name;
		badgenumber = object2.badgenumber;
	}
	
	public void set(String name1, String badgen) {
		name = name1;
		badgenumber = badgen;
}
	public String toString() {
		String str = "Officer Name: " + name + "\n" +
		"\nBadge Number: " + badgenumber + "\n";
		
		return str;
}

}

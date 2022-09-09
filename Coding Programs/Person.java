public class Person {

	private String name;
	private String address;
	private String phonenumber;
	
	public Person(String namec, String addressc, String phonenumberc) {
		setname(namec);
		setaddress(addressc);
		setphonenumber(phonenumberc);
	}

	
	public String getname() {
		return name;
	}
	
	public String getaddress() {
		return address;
	}
	
	public String getphonenumber() {
		return phonenumber;
	}
	
	public void setname(String names) {
		name = names;
	}
	
	public void setaddress(String addresses) {
		address = addresses;
	}
	
	public void setphonenumber(String phonenumbers) {
		phonenumber = phonenumbers;
	}
	
}

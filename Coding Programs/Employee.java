public class Employee extends ProductionWorker {
	
	private String ename;
	private String enumber;
	private String date;
	
	public Employee() {
	}
	
	public Employee(String enames, String enumbers, String edates) {
		setName(enames);
		setNumber(enumbers);
		setDate(edates);
	}
	
	public String getName() {
		return ename;
	}
	
	public String getNumber() {
		return enumber;
	}
	public boolean getError3() throws InvalidEmployeeNumber {
		throw new InvalidEmployeeNumber();
	}
	
	public String getDate() {
		return date;
	}
	
	public void setName(String name) {
		ename = name;
	}
	
	public void setNumber(String number) {
		enumber = number;
	}
	
	public void setDate(String Date) {
		date = Date;
	}
	

}

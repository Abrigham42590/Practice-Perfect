public class PayRolls {
	
	private String employeename;
	private String IDnumber;
	private double hourlypayrate;
	private double numberofhoursworked;

	public PayRolls(String employees, String ids, double hourlypay, double hours) {
		SetEmployees(employees);
		SetIDNumbers(ids);
		SetHourlyPayRates(hourlypay);
		SetNumberofHourswork(hours);
	}
	
	public String getEmployees() {
		return employeename;
	}
	
	public String getIDnumber() {
		return IDnumber;
	}
	
	public double getHourlyPayRates() {
		return hourlypayrate;
	}
	
	public double getNumberofHoursWorked() {
		return numberofhoursworked;
	}
	
	public double getgrosspay(double payrate, double hoursworked) {
		hourlypayrate = payrate;
		numberofhoursworked = hoursworked; 
		
		return payrate * hoursworked;
	}
	
	public boolean getError() throws InvalidRate {
		throw new InvalidRate();
	}
	
	public boolean getError2() throws InvalidValue {
		throw new InvalidValue();
	}
	
	public boolean getError3() throws InvalidHours {
		throw new InvalidHours();
	}
	
	public void SetEmployees(String employee) {
		employeename = employee;
	}
	
	public void SetIDNumbers(String IDnumbers) {
		IDnumber = IDnumbers;
	}
	
	public void SetHourlyPayRates(double payRates) {
		hourlypayrate = payRates;
	}
	
	public void SetNumberofHourswork(double numberofhours) {
		numberofhoursworked = numberofhours;
	}

}

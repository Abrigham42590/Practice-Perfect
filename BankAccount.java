public abstract class BankAccount {
	
	private double Balance;
	private double annualinterestrate;
	private static double deposit;
	private static double withdraw;

	public BankAccount(double Bal, double Air) {
		
		setBalance(Bal);
		setAIR(Air);
		
	}
	
	public double getBalance() {
		return Balance;
	}
	
	public double getAIR() {
		return annualinterestrate;
	}
	
	public void setBalance(double balance) {
		Balance = balance;
	}
	
	public void setAIR(double AIR) {
		annualinterestrate = AIR;
	}
	
	public double getamountofdeposits(double deposits) {
		
		double addbalance;
		
		deposit = deposits;
		
		addbalance = getBalance() + deposit;
		
		return addbalance; 
	}
	
	public double getamountd(double deposit2) {
		return deposit2;
	}
	
	public double getFinalBalance() {
		
		double total;
		
		total = deposit;
		
		return getamountofdeposits(total);
	}
	
	public double getFinalBalance2() {
		
		double total; 
		
		total = withdraw;
		
		return getamountofwithdraws(total);
		
	}
	
	public double numberofdeposits(double total) {
	   return total++;
	}
	
	public double getamountofwithdraws(double withdraws) {
		
		double subtractbalance;
		
		withdraw = withdraws;
		
		subtractbalance = getBalance() - withdraw;
		
		return subtractbalance;
	}
	
	public double getnumberofwithdraws(double total) {
		return total++;
	}
	
	public double getfeechargeW(double total) {
		
		double total2;
		
		total2 = getamountofwithdraws(total);
		
		return total2--;
		
	}
	

	
	public double getcalcinterest() {
		
		double monthlyinterestrate;
		double monthlyinterest;
		double newbalance, newvalue;
		
		newvalue = getAIR() / 100;
		monthlyinterestrate = (newvalue/12);
		monthlyinterest = (getFinalBalance() * monthlyinterestrate);
		newbalance = getFinalBalance() + monthlyinterest;
		
		return newbalance;
		
	}
	
	public double getcalcinterest2() {
		
		double monthlyinterestrate;
		double monthlyinterest;
		double newbalance, newvalue;
		
		newvalue = getAIR() / 100;
		monthlyinterestrate = (newvalue/12);
		monthlyinterest = (getFinalBalance2() * monthlyinterestrate);
		newbalance = getFinalBalance2() + monthlyinterest;
		
		return newbalance;
		
	}
	
	public double getcalcinterest3() {
		
		double monthlyinterestrate;
		double monthlyinterest;
		double newbalance, newvalue;
		
		newvalue = getAIR() / 100;
		monthlyinterestrate = (newvalue/12);
		monthlyinterest = (1024 * monthlyinterestrate);
		newbalance = 1024 + monthlyinterest;
		
		return newbalance;
	}
	
	public double getmonthlyprocess() {
		@SuppressWarnings("unused")
		double total, deposit, deposit2, count, count2;
		getamountofdeposits(deposit = 0);
		getamountofwithdraws(deposit2 = 0);
		return getcalcinterest();
	}
	
	public double getmonthlyprocess2() {
		return getcalcinterest2();
		
	}
	
	public double getmonthlyprocess3() {
		return getcalcinterest3();
	}
	
	
}
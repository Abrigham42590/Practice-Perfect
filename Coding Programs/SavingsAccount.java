public class SavingsAccount extends BankAccount {
	
	private static double Balance;
	private static double newtotal;

	public SavingsAccount(double B, double AIR) {
		super(B, AIR);
		Balance = B;
	
		
	}
	
	public void activeorinactiveW() {
		
		if (Balance < 25) {
			System.out.print("Your balance is less than minimum balance: Your account is now INACTIVE");
		}
		
		else if (Balance > 25) {
			System.out.print("Your account is now ACTIVE");
		}
						
		
		
	}
	
	public void activeorinactiveW2(double total, double count) {
		 
		double total2;
		
		total2 = Balance - total;
		
		if (total2 < 25) {
			System.out.print("Your balance is less than minimum balance. Your account is now INACTIVE\n");
		}
		
		if (getnumberofwithdraws(count) > 4) {
			System.out.print("You have exceeded monthly limit of withdrawals. Fee of $1 charged\n");
			newtotal = (getFinalBalance2() - 1);
		}
		

	}
	
	public void fees(double count) {
		if (getnumberofwithdraws(count) > 4) {
			System.out.print("You have exceeded monthly limit of withdrawals. Fee of $1 charged\n");
			newtotal = (getFinalBalance2() - 1);
		}
	}
	
	public double feechargeW (double total2) {
		
		double total;
		
		total = getamountofwithdraws(total2);
		
		return total -= 1;
	}
	
	public double feechargeW2 (double total2) {
		
		double total;
		
		total = getamountofwithdraws(total2);
		
		return total -= 1;
	}
	
	public double feechargeW3 (double total2) {
		
		double total;
		
		total = getamountofwithdraws(total2);
		
		return total -= 1;
	}
	
	public double feechargeW4 (double total2) {
		
		double total;
		
		total = getamountofwithdraws(total2);
		
		return total -= 1;
	}
	
	public double feechargeW5 (double total2) {
		
		double total;
		
		total = getamountofwithdraws(total2);
		
		return total -= 1;
	}
	
	public void getactiveD(double total) {
	
		double newdeposit;
		
		newdeposit = feechargeW2(total) + getamountd(total);
		
		if(newdeposit > 25) {
			System.out.print("Your account is now ACTIVE\n");
		}
		
	}
	
	public double getnewamountD(double newtotal) {
		
		double newamountd;
		
		newamountd = 18 + getamountd(newtotal);
		
		return newamountd;
	}
	
	public double getmonthlyprocess() {
		return getcalcinterest();
	}
	
	public boolean getError() throws InvalidValue {
		throw new InvalidValue();
	}
	
	public boolean getError2() throws InvalidChoice {
		throw new InvalidChoice();
	}
	
	public boolean getError3() throws InvalidTransaction {
		throw new InvalidTransaction();
	}
	
	public boolean getError4() throws InactiveAccountError {
		throw new InactiveAccountError();
	}
	
	
	

}

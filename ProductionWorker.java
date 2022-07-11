public class ProductionWorker {
	
	private int shift;
	private double payrate;
	
	public ProductionWorker() {
		
	}
	
	public ProductionWorker(int shifte, double payratee) {	
		setShift(shifte);
		setPayRate(payratee);
	}
	
	public int getShift() {
		return shift; 
	}
	
	public double getPayRate() {
		return payrate;
	}
	
	public boolean getError() throws InvalidPayRate {
		throw new InvalidPayRate();
	}
	
	public boolean getError2() throws InvalidShift {
		throw new InvalidShift();
	}
 	
	public void setShift(int shifts) {
		shift = shifts;
	}
	
	public void setPayRate(double payrates) {
		payrate = payrates;
	}
	
	
	

}
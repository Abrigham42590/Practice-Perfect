public class CashRegister {
	
	private double nitems;
	private String item;
	private double cost;

	public CashRegister(double Nitems, String items, double Costs) {
		setItems(Nitems);
		setItem(items);
		setCost(Costs);
	}
	
	public double getitems() {
		return nitems;
	}
	
	public double getcost() {
		return cost;
	}
	
	public String getitem() {
		return item;
	}
	
	public void setItems(double numberofitems) {
		nitems = numberofitems;
	}
	
	public void setItem(String Item) {
		item = Item; 
	}
	
	public void setCost(double cost1) {
		cost = cost1;
	}
	
	public double getSubTotal() {
		return getitems() * getcost();
	}
	
	public double getTax() {
		return 0.06 * getSubTotal();
	}
	
	public double getTotal() {
		return getSubTotal() + getTax();
	}

}

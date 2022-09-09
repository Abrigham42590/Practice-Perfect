@SuppressWarnings("serial")
public class InvalidTransaction extends Exception {

	public InvalidTransaction() {
		super("ERROR: Transaction declined!! This transaction will cause overdraft or zero balance\n");
	}

}

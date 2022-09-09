@SuppressWarnings("serial")
public class InvalidRate extends Exception {

	public InvalidRate() {
		super("Error: Hourly Rate Cannot be negative or greater than 25");
	}

}

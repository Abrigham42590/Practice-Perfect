@SuppressWarnings("serial")
public class InvalidHours extends Exception {

	public InvalidHours() {
		super("Error: Hours Cannot be negative or greater than 84\n");
	}

}

@SuppressWarnings("serial")
public class InactiveAccountError extends Exception {

	public InactiveAccountError() {
		super("Error: Your account is INACTIVE\n");
	}

}

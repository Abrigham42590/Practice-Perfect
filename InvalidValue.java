@SuppressWarnings("serial")
public class InvalidValue extends Exception {

	public InvalidValue() {
		super("Error: Numericals in ID must be between 0-9 and letters must be between A-M\n");
	}

}
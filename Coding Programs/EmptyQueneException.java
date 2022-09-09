@SuppressWarnings("serial")
public class EmptyQueneException extends RuntimeException {
	
	public EmptyQueneException() {
		super("Error: No more items in QUEUE \n");
	}
	

}

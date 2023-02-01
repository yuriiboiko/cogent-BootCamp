package q1.com.exception;

public class InvalidBookException extends RuntimeException {
	
	private String errorMessage;

	public InvalidBookException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

}

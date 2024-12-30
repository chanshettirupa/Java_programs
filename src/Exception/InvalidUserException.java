package Exception;

//Implementation of Runtime Exception
public class InvalidUserException extends RuntimeException {  // Here we extended RuntimeException class so compiler  will not force you to handle the exception i.e called Runtime Exception / Unchecked Exception
	
	public InvalidUserException(String str) {
		super(str);
	}
}

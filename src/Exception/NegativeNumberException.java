package Exception;

//Implementation of Compile time Exception
public class NegativeNumberException extends Exception { // Here we extended Exception class so compiler will force you to handle the exception i.e called compile time Exception / checked Exception
	
	String str;
	
	public NegativeNumberException(String str) {
		this.str = str;
	}
	
	public String tostring() {
		return str;
	}
}

package Exception;

//Implementation of Runtime Exception
import java.util.Scanner;

class Demo1 {
	public void verifyAge(int age) throws InvalidUserException {
		
		if(age<18) 
		{	
				throw new InvalidUserException("age is below 18 so user in not eligible for voting");
		}
		else {
			System.out.println("Please give the vote");
		}
		
	}
}


public class ThrowExceptionWithClass { //Custom Exception
	
	public static void main(String s[])  {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		
		Demo1 d1 = new Demo1();
		
		// If you want to extend Exception then you need to handle the try catch block 
		d1.verifyAge(age); // Here we extended RuntimeException class so compiler  will not force you to handle the exception i.e called Runtime Exception / Unchecked Exception
		
		
	}

}



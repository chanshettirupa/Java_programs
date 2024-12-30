package Exception;

//Implementation of Compile time Exception
import java.util.Scanner;

class BaseClass {
	
	public void display(int no1) throws NegativeNumberException, ArithmeticException //throws can throw more than 1 exception 
	{
		if(no1<0)
		{
			throw new NegativeNumberException("Number is Neagtive"); // throw can throw only 1 exception at a time 
		}
		no1 = no1/0;
		throw new ArithmeticException("Handling Arithematic Exception");
	}
}

public class CustomException {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number :");
		int no = sc.nextInt();
		
		BaseClass obj = new BaseClass();
		
		try {
			obj.display(no); // Here we extended Exception class so compiler will force you to handle the exception i.e called compile time Exception / checked Exception
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}

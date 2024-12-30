package Exception;

import java.util.Scanner;

public class Demo 
{
	public static void main(String s[])
	{
		Scanner sc = new Scanner(System.in);
		
		int var;
		System.out.println("Enter Integer value: ");
		var = sc.nextInt();
		
		try {
			var = var/5; // This line have Exception
			
		}
		catch (ArithmeticException e) {
			System.out.println("Arithematic exception:"+e);
			
		}
		catch(Exception e) {
			System.out.println("Enter value other than 0"+e);
		}
	}

}

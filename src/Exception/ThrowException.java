package Exception;

import java.util.Scanner;

public class ThrowException {
	
	public static void main(String s[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter password: ");
		String password = sc.nextLine() ; // next() reads only one word and nextLine() reads hole one line 
		
		System.out.println("Password is :"+password);
		try {
			if(password.length() < 8) {
				//Anything u need to print then pass the string in exception mtd it will call super class to print this
				throw new Exception("Password length should be above 8"); //first way to catch the custom exception
			}
		}
		catch(Exception e) {
			System.out.println("Password length should be above 8: "+e); // this will not print it will print only object e
		}
		
		
	}

}

package Thread;


//Thread Concept Implemented by implementing Runnable Interface
//Purpose- for code optimization we used Anonymous class with Lambda Expression


public class ThreadUsingLambdaExpression {
	
	public static void main(String s[]) {
		Runnable obj1 = () -> {            // Lambda function with Anonymous Class
			for(int i=0 ; i< 100; i++ ) {
				System.out.println("Hi");
			}
		}; 
		Runnable obj2 = () ->{
			for(int i=0 ; i< 100; i++ ) {
				System.out.println("Hello");
			}
		};
		
		// Runnable Interface not have Thread methods so creating Thread object to call the method
		Thread t1 = new Thread(obj1); // creating thread object and passing A class object for reference 
		Thread t2 = new Thread(obj2);
		
		// start() method responsible to call the run() method implicitly 
		t1.start(); // creating object of thread class to call the start method
		t2.start();
		
	}

}


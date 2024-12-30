package Thread;


//Thread Concept Implemented by implementing Runnable Interface
// Purpose - when we want to extend more than one class we cannot so using interface we can achieve it so we can implement interface.

class printThread implements Runnable {
	public void run()  {
		for(int i=0 ; i< 100; i++ ) {
			System.out.println("Hi");
		}
	}
}

class printNumbers implements Runnable {
	public void run() {
		for(int i=0 ; i< 100; i++ ) {
			System.out.println("Hello");
		}
	}
}

//Note - Class have only one public class
public class RunnableThread {
	
	public static void main(String s[]) {
		Runnable obj1 = new printThread(); // we can create reference of interface and give the super class reference to base class
		printNumbers obj2 = new printNumbers();
		
		// Runable Interface not have Thread methods so creating Thread object to call the method
		Thread t1 = new Thread(obj1); // creating thread object and passing A class object for reference 
		Thread t2 = new Thread(obj2);
		
		// start() method responsible to call the run() method implicitly 
		t1.start(); // creating object of thread class to call the start method
		t2.start();
		
	}

}


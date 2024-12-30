package Thread;

// Thread Concept Implemented by extending Thread class

class A extends Thread{
	public void run()  {
		for(int i=0 ; i< 100; i++ ) {
			System.out.println("Hi");
		}
	}
}

class B extends Thread{
	public void run() {
		for(int i=0 ; i< 100; i++ ) {
			System.out.println("Hello");
		}
	}
}

//Note - Class have only one public class
public class ThreadExample {
	
	public static void main(String s[]) {
		A obj1 = new A();
		B obj2 = new B();
		
		// start() method responsible to call the run() method implicitly 
		obj1.start(); // If Thread class not extend then it will show the error
		obj2.start();
		
	}

}


package Thread;


//Purpose - To prevent consistency problem.
/* 
* There are two types of thread synchronization mutual exclusive and inter-thread communication.
1)Mutual Exclusive
	Synchronized method.
	Synchronized block.
	Static synchronization.
2) Cooperation (Inter-thread communication in java) - it is implemented wait(), notify() and nofifyAll()
*/

class Multiplication extends Thread {
	
	synchronized public void MultiplicationTable(int no) {  // Used synchronized method to completed the first table then go to another table
		for (int i=1;i<=10;i++) {
			System.out.println(no*i);
		}
	}
}

class Aclass extends Thread{
	
	Multiplication t;
	Aclass(Multiplication t){
		this.t = t;
	}
	
	public void run() {
		t.MultiplicationTable(5);  // create Multiplication object to access this method 
	}
}

class BClass extends Thread{
	

	Multiplication t;
	BClass(Multiplication t){
		this.t = t;
	}
	
	public void run() {
		t.MultiplicationTable(100);  // create Multiplication object to access this method 
	}
}



public class synchronizedKayword {

	public static void main(String[] args) {
		
		Multiplication obj = new Multiplication(); // create common object
		
		Aclass t1= new Aclass(obj);
		BClass t2= new BClass(obj);
		
		t1.start();
		t2.start();

	}

}

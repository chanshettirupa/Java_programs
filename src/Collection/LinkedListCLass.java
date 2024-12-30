package Collection;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.RandomAccess;
import java.util.Vector;

public class LinkedListCLass {

	public static void main(String[] args) {
		
		LinkedList l1 = new LinkedList(); // 1)default constructor
		
		l1.addFirst("10");
		l1.addFirst(1);     // It consider last addfirst element should be the first element of LL
		l1.addLast(99);
		l1.addLast(9);		// It consider last addlast element should be the last element of LL
		
	
		System.out.println("Linedked list 1 : First element :" +l1.getFirst());  //Fetch 1st element from LL
		System.out.println("Linedked list 1 : Last element :" +l1.getLast());  //Fetch 1st element from LL
		
		Vector v = new Vector(4);
		
		v.add(10);
		v.add(20);
		
		LinkedList l2 = new LinkedList(v); // 2)creating collection constructor
		System.out.println("Linedked list 1 :" +l1);
		
		System.out.println("Linedked list 2 :" +l2);
		
		System.out.println("---------------------------------------------");
		System.out.println("Seralizable Object :" +(l2 instanceof Serializable));
		System.out.println("Clonable Object :" +(l2 instanceof Cloneable));
		System.out.println("Random Access Object l2:" +(l2 instanceof RandomAccess));  // doesn't support RandomAccess to LL
		System.out.println("Random Access Object  l1:" +(l1 instanceof RandomAccess));

	}

}

package Collection.set;

import java.util.TreeSet;

// Insertion order not preserve and sorting is allowed so heterogeneous object is not allowed
public class TreeSetEg {
	
public static void main(String[] args) {
		
		TreeSet ob = new TreeSet();
		ob.add("A");
		ob.add("a");  // sorting based on ASCI code 
		ob.add("C");
		ob.add("Z");
		ob.add("L");
		//ob.add(null);   // Error - Null pointer exception for empty treeset null allowed
		//ob.add(new Integer(10));  //Exception - Class cast Exception only same data is allowed
		System.out.println("elements-"+ob);
		System.out.println("First object->"+ob.first()); // we can access the sortedset method
		
		// constructor -
		//TreeSet ob = new TreeSet(comparator t);  for customize sorting order
		//TreeSet ob = new TreeSet(collection c);  for customize sorting order
		//TreeSet ob = new TreeSet(SortedSet t);  for customize sorting order
		
//		ob.add(new StringBuffer('A'));
//		ob.add(new StringBuffer('Z'));       class catch Exception
//		System.out.println("elements-"+ob);  bcoz StringBuffer class cannot implement comparable(I) Interface
		
		//o/p - [A,C,L,Z,a]
	}
}

// Note - want to implement Natural sorting order then element should be comparable and homogeneous.
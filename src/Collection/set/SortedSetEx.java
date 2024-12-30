package Collection.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetEx {

	public static void main(String[] args) {
		
		SortedSet ob = new TreeSet();
//		ob.add("India");
//		ob.add("Pune");    // becoz for sorting heterogeneous object is not allowed
//		ob.add("Solapur");
		ob.add(10);
		ob.add(15);
		ob.add(94);
		ob.add(115);
		System.out.println("First object->"+ob.first());
		System.out.println("Last object->"+ob.last());
		System.out.println("Head of object->"+ob.headSet(94));  // o/p -[10,15] it returns elements less than passed object
		System.out.println("Tail of object->"+ob.tailSet(15));  // o/p - [15,94,115] it returns greater than passed object
		System.out.println("subset of object->"+ob.subSet(15,115)); //o/p - [15,94]  elements return from range 15 >= and <115 

	}

}

// Note - 
// 1. This is default sorting means Natural Sorting order so it sort by Numbers or characters in Ascending order
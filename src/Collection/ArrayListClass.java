package Collection;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/*
 Default initial capacity is 10
 Formula for custom new capacity = (current capacity *3/2) + 1;
 */

public class ArrayListClass {
	
	public static void main(String s[]) { 
		ArrayList l1 = new ArrayList();   // 1)it create default size 10
		ArrayList l2 = new ArrayList(2);  // 2) It creates the specified size of arraylist i.e 2
		
		ArrayList<Integer> l3= new ArrayList();  // specific to one datatype i.e Integer
		
		l1.add(10);
		l1.add(1, "Rupa");
		//l1.add(2, "Rupa"); // index should utilize sequentially it gives runtime error IndexoutofBound exception
		
		l1.addAll(l2);  // l2 is empty so not added the elements
	
		l2.add("ankita");
		l2.add(21.05);
		
		l1.addAll(l2); // Adding another arraylist
		
		System.out.println("Size is :"+l1.size());
		System.out.println("Array is -"+l1);   // while printing object l1 it will call the toString method to print the object so it print in []
	
		l2.remove(1);
		System.out.println("Array is -"+l2);
		
		l2.clear();
		System.out.println("Array is -"+l2);
		
		l3.add(10);
		//l3.add(null);  we can add null element as well 
		l3.add(1);
		l3.add(14);
		System.out.println("l3 array is:"+l3);
		Collections.sort(l3);						// sort arrayList using collections class
		System.out.println("Sorted Array:"+l3);    
		
		System.out.println("---------------------------------------------");
		System.out.println("Seralizable Object :" +(l2 instanceof Serializable));
		System.out.println("Clonable Object :" +(l2 instanceof Cloneable));
		System.out.println("Random Access Object l2:" +(l2 instanceof RandomAccess));  // It support RandomAccess 
		
	}
}

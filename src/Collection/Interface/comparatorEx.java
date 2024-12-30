package Collection.Interface;

import java.util.Comparator;
import java.util.TreeSet;

/*
 * Comparable -> For default natural sorting order
 * Comparator -> For customized sorting order
 * 				It provides 2 methods 1)compare() and 2)equals()
 * 				equals() method is optional bcoz it is present in base class i.e object class
 * */

public class comparatorEx {
	
public static void main(String[] args) {
		
		TreeSet t = new TreeSet(new mycomparator());
		t.add(10);
		t.add(0);
		t.add(91);
		t.add(5);
		System.out.println(t);
		
	}
}

class mycomparator implements Comparator {  // customized sorting for descending order
	
	public int compare(Object b1, Object b2) {
		
		Integer I1 = (Integer) b1;
		Integer I2 = (Integer) b2;
		return -I1.compareTo(I2);   //sorting in descending order
//		System.out.println("Ascending order ->"+I1.compareTo(I2));
//		System.out.println("Ascending order ->"+(-I2.compareTo(I1)));
//		System.out.println("Dcsending order ->"+I2.compareTo(I1));
//		System.out.println("Dcsending order ->"+(-I1.compareTo(I2)));
		
		
		// return +1 --> In Insertion order
		// return -1 --> Reverse of Insertion order
		// return 0 --> only first element is inserted and all other element considered as duplicate
	}
}

//Notes -
//Returns -ve -> If obj1 comes before obj2 (In eg A is before z so o/p is -57)
//Returns +ve -> If obj1 comes after obj2
//Returns 0 -> If obj1 equals to obj2

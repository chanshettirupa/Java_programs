package Collection.Interface;

import java.util.TreeSet;

/*
 * Comparable -> For default natural sorting order
 * 				 This method provide only one method that is compareTo()
 * Comparator -> For customized sorting order
 * */

public class ComparableEx {

	public static void main(String[] args) {
		
		TreeSet t = new TreeSet();
		t.add("A");
		t.add("C");
		t.add("L");
		t.add("Z");
		System.out.println("A compare to Z -> "+"A".compareTo("z"));  //o/p : -57
		System.out.println("Z compare to A -> "+"Z".compareTo("A"));  //o/p : 27
	}
}

// Notes -
// Returns -ve -> If obj1 comes before obj2 (In eg A is before z so o/p is -57)
// Returns +ve -> If obj1 comes after obj2
// Returns 0 -> If obj1 equals to obj2

package Collection.set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetSortingwithLength {

	public static void main(String[] args) {
		
		TreeSet t = new TreeSet(new mycomparator1()); 			// bydefault it sort in ascending order
		t.add("Rupa");
		t.add("Vaishu");
		t.add("Sahil");
		t.add("vinay");
		t.add("Aparna");
		System.out.println(t);

	}

}
class mycomparator1 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = (String) o1;					//String s1= o1.toString(); converting to string for sorting
		String s2 = (String) o2;
		int l1 = s1.length();
		int l2 = s2.length();
		if(11>l2)
			return +1;
		else if(l1<l2)
			return -1;
		else
			return 0; //(s1.compareTo(s2));
	}
	
}
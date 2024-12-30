package Collection.set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetReverseAlphaOrder {

	public static void main(String[] args) {
		TreeSet t = new TreeSet(); 			// bydefault it sort in ascending order
		t.add("Rupa");
		t.add("Vaishu");
		t.add("Sahil");
		t.add("vinay");
		t.add("Aparna");
		System.out.println(t);

		TreeSet t1 = new TreeSet(new mycomparator()); 			// sort in descending order
		t1.add("Rupa");
		t1.add("Vaishu");
		t1.add("Sahil");
		t1.add("vinay");
		t1.add("Aparna");
		System.out.println(t1);
		
		TreeSet t2 = new TreeSet(new mycomparator()); 			// sort in descending order for stringBuffer object
		t2.add(new StringBuffer("Rupa"));
		t2.add(new StringBuffer("Vaishu"));
		t2.add(new StringBuffer("Sahil"));
		t2.add(new StringBuffer("vinay"));
		t2.add(new StringBuffer("Aparna"));
		System.out.println(t2);									//It throw the java cast exception StringBuffer object can't covert to string

	}

}

class mycomparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = (String) o1;					//String s1= o1.toString(); converting to string for sorting
		String s2 = (String) o2;
		return -(s1.compareTo(s2));
	}
	
}
package Collection.set;

import java.util.HashSet;

public class HashsetExmple {

	public static void main(String[] args) {
		
		HashSet h = new HashSet();
		System.out.println("Capacity:"+h.size());  // default capacity is 16 and default load factor is 0.75
		
		HashSet h1 = new HashSet(10);
		h1.add(10);
		System.out.println("Capacity:"+h1.size());  // u can pass required capacity and default load factor is 0.75
		
		
		HashSet h2 = new HashSet(20,1);
		System.out.println("Capacity:"+h2.size());  // u can pass required capacity and pass default load factor
		
		h.add("B");
		h.add("Z");
		h.add(null);
		h.add(10);
		h.add("Z"); //return false because of duplicate object 
		System.out.println("Hash set-"+h); 			// by default sorted by natural sorting order  
		System.out.println("Capacity:"+h.size());
	}

}

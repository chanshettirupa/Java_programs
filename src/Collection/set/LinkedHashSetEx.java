package Collection.set;

import java.util.LinkedHashSet;

public class LinkedHashSetEx {

	public static void main(String[] args) {
		
		LinkedHashSet h = new LinkedHashSet();
		h.add(10);
		h.add(15);
		h.add("India");
		h.add(03);
		h.add(null);
		h.add(3);
		System.out.println("Linked Hash Set-"+h);
	}

}
// Note = Insertion order is preserved , no duplicate, heterogeneous , null allowed 
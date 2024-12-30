package Collection.cursor;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class cursorObjectDetail {

	public static void main(String[] args) {

		Vector v = new Vector()	;
		Enumeration e = v.elements();
		Iterator i = v.iterator();
		ListIterator I = v.listIterator();
		
		System.out.println(e.getClass().getName());
		System.out.println(i.getClass().getName());
		System.out.println(I.getClass().getName());
	}

}

/* Output -
java.util.Vector$1    -> it is printing corresponding class name eg vector$1. $ represent the inner class and 1 is the first inner class
java.util.Vector$Itr
java.util.Vector$ListItr
*/
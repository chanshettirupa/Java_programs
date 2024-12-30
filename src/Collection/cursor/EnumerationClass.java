package Collection.cursor;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationClass {    // 1.Enumeration class only support to old (Legacy classes) and 2.object no longer required removal operation not perform (only read operation)

	public static void main(String[] args) {

		Vector v = new Vector();
		for (int i=0;i<=10;i++) {
			v.add(i);
		}
		Enumeration e = v.elements();
		while(e.hasMoreElements()) {
			Integer i = (Integer) e.nextElement();
			if(i%2 == 0)
				System.out.println("Even number list:"+i);
		}
		
		System.out.println("Vector is : "+v);
	}

}

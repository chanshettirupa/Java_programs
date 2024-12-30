package Collection;

import java.io.Serializable;
import java.util.RandomAccess;
import java.util.Vector;

public class VectorClass {

	public static void main(String[] args) {
		
		Vector v = new Vector();     // 1) default size 10 
		System.out.println("Default capacity: 1st constructor "+v.capacity());
		
		for(int i=0;i<=10;i++) {
			v.addElement(i);		// when 11th element comes it grow the size of the array 
		}
		System.out.println("New Vector size: 1st constructor "+v.size());    // return the number of element present in the vector
		
		System.out.println("Vector is : "+v);
		System.out.println("First element :"+v.firstElement());
		System.out.println("Last element :"+v.lastElement());
		
		System.out.println("New capacity: "+v.capacity());   // New capacity = current capacity *2
		
		Vector v1 = new Vector(15);      //2) creating vector with required size
		System.out.println("New Vector capacity: 2nd constructor "+v1.capacity());
		
		Vector v2 = new Vector(19,2);     //3) Increasing the capacity by specifying the value
		System.out.println("New Vector capacity: 3rd constructor "+v2.capacity());   // New capacity = current capacity *2 i.e 12
		
		System.out.println("New Vector size: 3rd constructor "+v2.size());
		
		System.out.println("---------------------------------------------");
		System.out.println("Seralizable Object :" +(v instanceof Serializable));
		System.out.println("Clonable Object :" +(v1 instanceof Cloneable));
		System.out.println("Random Access Object l2:" +(v2 instanceof RandomAccess));  // It support RandomAccess 
		

	}

}

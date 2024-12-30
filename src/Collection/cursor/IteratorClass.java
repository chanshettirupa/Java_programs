package Collection.cursor;

import java.util.ArrayList;
import java.util.Iterator;


public class IteratorClass {   // It used as Universal cursor and it also remove the object as well
 
	public static void main(String[] args) {
		
		ArrayList l1 = new ArrayList();
		for (int i=0;i<=10;i++) {
			l1.add(i);
		}
		Iterator itr = l1.iterator();
		while(itr.hasNext()) {
			Integer i = (Integer) itr.next();
			if(i%2 == 0)
				System.out.println("Even number list:"+i);
			else
				itr.remove();      // Removing odd numbers from AL
		}
		
		System.out.println("ArrayList is : "+l1);	//disadv is cannot read in backward direction and replace won't perform using iterator
	}

}


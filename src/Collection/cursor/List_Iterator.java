package Collection.cursor;


import java.util.LinkedList;
import java.util.ListIterator;

public class List_Iterator {   // This can be used by list classes

	public static void main(String[] args) {  
		
		LinkedList l1 = new LinkedList();
		for (int i=0;i<=10;i++) {
			l1.add(i);
		}
		ListIterator itr = l1.listIterator();
		while(itr.hasNext()) {
			Integer i = (Integer) itr.next();
			if(i%2 == 0)
				System.out.println("Even number list:"+i);
			else if(i == 5) 
				itr.add(15);   // add element after 5 value
			else if(i == 9) 
				itr.set(19);   // replace 9 to 19
			else
				itr.remove();      // Removing odd numbers from AL
		}
		
		System.out.println("Linked List is : "+l1);	//disadv is cannot read in backward direction and replace won't perform using iterator
		
		System.out.println("Linked List previous index is : "+itr.previousIndex());
		System.out.println("Linked List has previous element : "+itr.hasPrevious());
		System.out.println("Linked List previous elemnet is : "+itr.previous());
		System.out.println("Linked List previous index is : "+itr.previousIndex()); // if it call start of LL then it return -1 bcoz no previous element is present
	}

}

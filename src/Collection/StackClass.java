package Collection;

import java.util.Stack;

public class StackClass {

	public static void main(String[] args) {

		Stack obj = new Stack();
		
		obj.push("Rupa");
		obj.push(10);
		obj.push(50.07);
		
		System.out.println("Stack Elements : "+ obj);
		
		obj.pop();
		
		System.out.println("Stack Elements : "+ obj);
		
		System.out.println("Stack peak Elements is : "+ obj.peek());
		
		System.out.println("Stack is empty : "+ obj.isEmpty());
		
		System.out.println("search Element in Stack : "+ obj.search(10));     //Element found then it returns 1
		System.out.println("search Element in Stack : "+ obj.search("rupa")); //Element not found then it returns -1

	}

}

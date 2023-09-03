package Collections;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		/*
		 * LIFO - last in first out -Stack
		 * 
		 * FIFO- First in First Out -Queue
		 * 
		 * Stack is a class in java which implements the list interface and extends the vector
		 * class and also represents  LIFO principle
		 * 
		 * 
		 *  Creating a list 
		 *  
		  
		 */

		Stack<String> books=new Stack<>();

		System.out.println(s.size());
		//adding elements to the list
		
		books.push("White");
		books.push("Red");
		books.push("Black");
		books.push("Blue");
		
		System.out.println(books.capacity());
		System.out.println(books);
		for (String integer : books) {
			System.out.println(integer);
		}
         
		//Retrieval of elements in the list
		System.out.println(books.peek());
		
		//deletion of elements in the list
		
		System.out.println(books.pop());
		
		//verification of elements in the list
		
		System.out.println(books.search(4));
		
		//updation of elements in the list
		
        System.out.println(books);
        
        /*
         * 0
         * 10
         * yes
         * yes
         * yes
         * no
         * yes
         * yes
         * 
         * undo/redo operations,web browser history,backtracking,reverse the data
         * 
         */
	}

}

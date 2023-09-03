package Collections;

import java.util.LinkedList;

public class LinkedListEX {

	//Linked List is good for updation and deletion of elements in the list
	//good for adding elements in the middle
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> ll=new LinkedList<>();
		
		ll.add(null);
		ll.add("siv");
		ll.add("teja");
		ll.add("teja");

		System.out.println(ll);
		
		System.out.println(ll.get(0));
		
		System.out.println(ll.remove(3));
		System.out.println(ll.set(2,"vmvm"));
		System.out.println(ll);
		System.out.println(ll.contains("siv"));
	}

}

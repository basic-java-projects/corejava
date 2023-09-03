package Collections;

import java.util.Vector;

public class ListVector {

	//Size - No of elements in the list
	//Capacity - Array Capacity
	//Vector is good at data is increasing Exponentially
	public static void main(String[] args) {

		Vector<String> v1=new Vector<>();
		
		v1.add("siva");
		v1.add(0,"prasad");
		v1.add("a");
		v1.add("a");
		v1.add("a");
		v1.add("a");
		v1.add("a");
		v1.add("a");
		v1.add("a");
		v1.add("a");
		v1.add("a");
		v1.add("a");
		
		Vector<String> v2= new Vector<>();
		v2.add("rajesh");
		v2.add("a");
		v2.add("a");
		
		Vector<String> v3=new Vector<>();
		v3.add("a");
		v1.addAll(v2);
		v1.addAll(v3);
		System.out.println(v1);
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		
		System.out.println(v1.get(0));
		System.out.println(v1.remove(10));
		System.out.println(v1.contains("prasad"));
		
		System.out.println(v1.set(3, "Srikanth"));
		
		System.out.println(v1);
		
		/*
		 * 
		 * 10
		 * 10
		 * yes
		 * yes
		 * yes
		 * no
		 * yes
		 * yes
		 * MultiThreading, data is exponentially increasing
		 */
	}

}

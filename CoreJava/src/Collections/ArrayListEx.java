package Collections;

import java.util.ArrayList;
import java.util.Collections;


/**
 * Collections is a framework provided by java
 * 
 * This framework provides many interfaces and their implemented classes
 * in order to store group of objects(elements) in a single entity
 * 
 * Collections has two interfaces
 * 1.Collection
 *   i)List<interface> ArrayList,Vector(Stack),LinkedList
 *   ii)Set<interface> HashSet,LinkedHashSet,TreeSet
 *   iii)Queue<interface> PriorityQueue
 *       Dequeue<interface> ArrayDeque
 * 2.Map
 *   i)HashMap (LinkedHashMap)
 *   ii)HashTable
 *   iii)SortedMap<>interface NavigableMap<interface> TreeMap
 */
	
public class ArrayListEx {
	
	public static void main(String args[]) {
//Array List is good for adding and retrieval of elements in the list
	ArrayList<String> al=new ArrayList<>();
	
    al.add("5");
	al.add("5");
	al.add(null);
	al.add(null);
	Collections.synchronizedCollection(al);
	System.out.println(al);
	System.out.println(al.get(3));
	System.out.println(al.remove(3));
	System.out.println(al.set(1,"ArrayList"));
	System.out.println(al);
	
	/*
	 * 
	 * 0
	 * 10
	 * yes
	 * yes
	 * yes
	 * no
	 * yes
	 * no
	 * memory saving
	 */
	
}
}
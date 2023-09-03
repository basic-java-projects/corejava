package Collections;

import java.util.ArrayList;
import java.util.List;

public class ListAssignment {

	public static void main(String[] args) {

		//print the sum and average of the elements
		
		ArrayList<Integer> al=new ArrayList<>();
		
		  al.add(4);
		  al.add(5);
		  al.add(0);
		  al.add(9);
		  al.add(8);
		  al.add(10);
		  al.add(4);
		  al.add(5);
		  al.add(0);
		  al.add(9);
		  al.add(8);
		  al.add(10);
		  
		  System.out.println(al);

		  Integer total=0;
		  Integer avg=0;
		  Integer even=0;
		  for (Integer integer : al) {
			  
			  total += integer;
			  if(integer%2==0)
			  {
				  even +=integer;
			  }
			  
			 
			  
		}

		   avg +=total/al.size();
		 	System.out.println(total);	
		 	System.out.println(avg);
		 	System.out.println(even);
		 	ArrayList<Integer> list1=new ArrayList<>(al.subList(0, al.size()/2));
			  
			 List<Integer> list2=new ArrayList<>(al.subList(al.size()/2, al.size()));
			 
			 System.out.println(list1);
			 System.out.println(list2);
			 
			 list1.addAll(list2);
			 System.out.println(list1);
			 
			 
			 

	}

}

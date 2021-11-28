package mypkg;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class SetExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Set set = new HashSet();
		set.add("one");
		set.add("second");
		set.add("3rd");
		set.add(new Integer(4));
		set.add(new Float(5.0F));
		set.add("second");		// NO duplicates are allowed
		set.add(new Integer(4));

		System.out.println(set);
		System.out.println("--------------------------------------");
		// number of objects in collection
		System.out.println("Total Size "+set.size());
		
		  if (set.contains(new Integer(4))) {
			   System.out.println("HashSet contains 4 as value");
			  } else {
			   System.out.println("HashSet does not contain 4 as value");
			  }
		  System.out.println("--------------------------------------");
		  if (set.isEmpty()) {
				System.out.println("Collection is empty");
			} else {
				System.out.println("Collection size: " + set.size());
			}
		  
		  System.out.println("--------------------------------------");
		  
		  Object[] elements = set.toArray();
		  for (int i = 0; i < elements.length; i++)
		   System.out.println(elements[i]);
		
		  
  		  System.out.println("--------------------------------------");
		  System.out.println("Is 4 removed from the HashSet ? "
				    + set.remove(new Integer(4)));
		  System.out.println(set);
		  System.out.println("--------------------------------------");
		  
			Iterator i=set.iterator();
			while(i.hasNext())
			{
						Object o=i.next();
						//	String o=(String)li.next();
						System.out.println("*---- "+o+"--- ");
			}
			
			// Not Valid for Set
		/*	while(i.hasPrevious()) {
				Object element = i.previous();
				System.out.println(element + " ");
				}*/
			System.out.println("--------------------------------------");	
			  set.clear();
				int size = set.size();
				if (set.isEmpty()) {
					System.out.println("Collection is empty");
				} else {
					System.out.println("Collection size: " + size);
				}
				
				System.out.println("--------------------------------------");
	}
}

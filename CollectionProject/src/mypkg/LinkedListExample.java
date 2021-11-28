package mypkg;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.add(0,"one");
		list.add(1,"second");
		list.add(2,"3rd");
		list.add(3,new Integer(4));
		list.add(4,new Float(5.0F));
		list.add(5,"second");		// duplicates are allowed
		list.add(6,new Integer(4));
		list.addFirst("First");
		list.addLast("Last Object");
		System.out.println(list);
		System.out.println("--------------------------------------");
		// number of objects in collection
		System.out.println("Total Size "+list.size());
		
		  if (list.contains(new Integer(4))) {
			   System.out.println("LinkedList contains 4 as value");
			  } else {
			   System.out.println("LinkedList does not contain 4 as value");
			  }
		  System.out.println("--------------------------------------");
		
		  Integer one = (Integer) list.get(4);
		  System.out.println("Value at 4 index is " + one);
		  System.out.println("--------------------------------------");
		  
		  System.out.println("Index of first occourance of 4 is "
				  + list.indexOf(new Integer(4)));
		  System.out.println("--------------------------------------");
		  
		  Object[] elements = list.toArray();
		  for (int i = 0; i < elements.length; i++)
		   System.out.println(elements[i]);
		  System.out.println("--------------------------------------");
			System.out.println(list);
			// retrive element object at 4th index
            System.out.println("Element at 4th index"+list.get(4));
            // set or replace element object at 4th index
            list.set(4,"two");
            System.out.println(list);
           System.out.println("--------------------------------------");
           System.out.println(list);
           list.add(4,"Inserted Object");
           System.out.println(list);
           list.removeFirst();
           list.removeLast();
           System.out.println(list);
  		  System.out.println("--------------------------------------");
		  System.out.println("Is 4 removed from the LinkedList ? "
				    + list.remove(new Integer(4)));
		  System.out.println(list);
		  System.out.println("--------------------------------------");
		  
			ListIterator li=list.listIterator();
			while(li.hasNext())
			{
						Object o=li.next();
						//	String o=(String)li.next();
						System.out.println("*---- "+o+"--- ");
			}
			 
			System.out.println("--------------------------------------");
			while(li.hasPrevious()) {
				Object element = li.previous();
				System.out.println(element + " ");
				}
			System.out.println("--------------------------------------");	
			  list.clear();
				int size = list.size();
				if (list.isEmpty()) {
					System.out.println("Collection is empty");
				} else {
					System.out.println("Collection size: " + size);
				}
				
				System.out.println("--------------------------------------");
			System.out.println(list.get(8)); // exception is throws at run time
			//Exception in thread "main" java.lang.IndexOutOfBoundsException
	}

}

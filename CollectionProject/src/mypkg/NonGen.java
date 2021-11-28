package mypkg;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NonGen {


	public static void main(String[] args) {
	    List partList = new ArrayList(3);
	    
	    partList.add(new Integer(1111));
	    partList.add(2222);  // boxing
	    partList.add(new Integer(3333));
	    partList.add("Oops a string!");
	 
	    Iterator elements = partList.iterator();    
	    while (elements.hasNext()) {
	      Integer partNumberObject = (Integer)(elements.next()); // error?
	      int partNumber = partNumberObject.intValue();
	      
	      System.out.println("Part number: " + partNumber);
	    }       

	}

}

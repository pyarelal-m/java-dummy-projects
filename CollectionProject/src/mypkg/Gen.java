package mypkg;
import java.util.*;
public class Gen {

	public static void main(String[] args) {
		// type of right side is the type of left side
		//jdk 1.7 onwords
	    List<Integer> partList = new ArrayList<>(3);
	    partList.add(new Integer(1111));
	    partList.add(2222);  // boxing
	    partList.add(new Integer(3333));
	    //partList.add("Bad Data");  // compile error now 
	 
	    Iterator<Integer> elements = partList.iterator();
	    while (elements.hasNext()) {
	      Integer partNumberObject = elements.next();
	      int partNumber =partNumberObject;   // unboxing
	 
	      System.out.println("Part number: " + partNumber);
	    }

	    for (Integer partNumberObj:partList){
	        int partNumber = partNumberObj; // Demos auto unboxing
	        System.out.println("Part number: " + partNumber);  
	  }

	}

}

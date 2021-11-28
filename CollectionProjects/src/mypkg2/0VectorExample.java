package mypkg2;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector list=new Vector();
		list.add("one");
		list.add("second");
		list.add("3rd");
		list.add(new Integer(4));
		 list.add(new Float(5.0F));
		 list.add("second"); // duplicate, is added
		  list.add(new Integer(4)); // duplicate, is added
		System.out.println(list);
		Enumeration enu=list.elements();
		while(enu.hasMoreElements())
		{

			System.out.println(enu.nextElement());
		}

	}

}

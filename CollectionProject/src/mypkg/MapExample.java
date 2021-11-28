package mypkg;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		// Create a hash map
		HashMap hm = new HashMap();
		// Put elements to the map
		hm.put("John Doe", new Double(3434.34));
		hm.put("Tom Smith", new Double(123.22));
		hm.put("Jane Baker", new Double(1378.00));
		hm.put("Todd Hall", new Double(99.22));
		hm.put("Ralph Smith", new Double(-19.08));
		
		// Get a set of the entries
		Set set = hm.entrySet();
		// Get an iterator
		Iterator i = set.iterator();
		// Display elements
		while(i.hasNext()) {
		Map.Entry me = (Map.Entry)i.next();
		System.out.print(me.getKey() + ": ");
		System.out.println(me.getValue());
		}
		
		// one key points to only one value
		Object o=hm.get("John Doe");
		Double d=(Double)o;
		double balance = d.doubleValue();
		System.out.println("John Doe balance is "+balance);
		
		hm.put("John Doe", new Double(balance + 1000));
		System.out.println("John Doe's new balance: " +
		hm.get("John Doe"));
		
		  if (hm.containsKey("Todd Hall")) {
			   System.out.println("HashMap contains Todd Hall as key");
			  } else {
				  System.out.println("HashMap DOES NOIT contain Todd Hall as key");
			  }
			// Returns set view of keys
			Set set1 = hm.keySet();
			System.out.println(set1);
			for(Object key:set1)
			{
				String k=(String)key;
				Object val=hm.get(k);
				Double dd=(Double )val;
				System.out.println("key is = "+k +" Value is ="+dd);
			}

			// Returns Collection view of values
			Collection collection = hm.values();
			System.out.println(collection);
	}

}

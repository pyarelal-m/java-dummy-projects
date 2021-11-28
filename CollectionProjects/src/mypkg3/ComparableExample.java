package mypkg3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ComparableExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List ts1 = new ArrayList();
		ts1.add(new EmployeeComparable(2,"Tom", 40000.00));
		ts1.add(new EmployeeComparable(1,"Harry", 20000.00));
		ts1.add(new EmployeeComparable(3,"Maggie", 50000.00));
		ts1.add(new EmployeeComparable(4,"Chris", 70000.00));
		Collections.sort(ts1);
		Iterator itr = ts1.iterator();

		while (itr.hasNext()) {
			Object element = itr.next();
			System.out.println(element.toString() + "\n");

		}

	}

}

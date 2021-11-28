package mypkg3;

import java.util.Comparator;

public class NameComp implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		EmployeeComparable e1=(EmployeeComparable) o1;
		EmployeeComparable e2=(EmployeeComparable) o2;
		return e1.getName().compareTo(e2.getName());
	}

}

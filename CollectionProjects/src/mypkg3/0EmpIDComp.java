package mypkg3;

import java.util.Comparator;

public class EmpIDComp implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		EmployeeComparable e1=(EmployeeComparable) o1;
		EmployeeComparable e2=(EmployeeComparable) o2;
		if (e1.getEmpID() == e2.getEmpID())
			return 0;
		else if ((e1.getEmpID()) > e2.getEmpID())
			return 1;
		else
			return -1;
		
	}

}

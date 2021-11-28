package mypkg3;

public class EmployeeComparable implements Comparable{
	private int empID;
	private String name;
	private double sal;
	public EmployeeComparable() {
		// TODO Auto-generated constructor stub
	}
	public EmployeeComparable(int empID, String name, double sal) {
		super();
		this.empID = empID;
		this.name = name;
		this.sal = sal;
	}
	
	public int getEmpID() {
		return empID;
	}
	public String getName() {
		return name;
	}
	public double getSal() {
		return sal;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
	@Override
	public int compareTo(Object o1) {
		EmployeeComparable e=(EmployeeComparable) o1;
		if (this.sal == e.sal)
			return 0;
		else if ((this.sal) > e.sal)
			return 1;
		else
			return -1;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  empID + " "+name+ " "+sal;
	}
}

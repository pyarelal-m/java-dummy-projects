package cms;

public class Employee {
	private int eid;
	private String ename;
	private double salary;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int eid, String ename, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public boolean equals(Object arg0) {
		Employee e=(Employee) arg0;
		if(this.getEid()==e.getEid() && this.getEname().equals(e.getEname()) && this.getSalary()==e.getSalary())
			return true;
		else
			return false;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return eid ^ename.hashCode()^( (int) salary);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return eid + " "+ename + " "+salary;
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println(eid + " object is destroying");
	}
	
}

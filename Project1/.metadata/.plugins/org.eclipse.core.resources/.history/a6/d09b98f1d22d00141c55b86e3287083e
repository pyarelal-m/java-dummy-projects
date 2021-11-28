package cms.data;

public class Manager extends Employee {
	private String dept;
	public Manager() {
		super.setEid(1);
	}
	public Manager(int eid, String ename, double salary,String dept) {
		//super(); // default constructor will be called automatically
		super(eid, ename, salary);
		this.dept=dept;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public void getDetails() {
		super.getDetails();
		System.out.println("Department is "+dept);
	}
	

}

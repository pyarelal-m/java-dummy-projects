package cms.data;

public class Manager extends Emp {
	private String dept;

	public Manager() {
		super.setEid(1);
		// TODO Auto-generated constructor stub
	}

	public Manager(int eid, String ename, double salary, String dept) {
		super(eid, ename, salary);
		this.dept=dept;
		// TODO Auto-generated constructor stub
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public void getDetails() {
		// TODO Auto-generated method stub
		super.getDetails();
		System.out.println("Department is "+dept);
	}
	
	

}

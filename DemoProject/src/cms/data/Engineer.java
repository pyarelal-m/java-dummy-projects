package cms.data;

public class Engineer extends Employee {
	private String proj;
	public Engineer() {
	}
	public Engineer(int eid, String ename, double salary,String proj) {
		super(eid, ename, salary);
		this.proj=proj;
	}
	public String getProj() {
		return proj;
	}
	public void setProj(String proj) {
		this.proj = proj;
	}
	@Override
	public void getDetails() {
			super.getDetails();
			System.out.println("Project is "+proj);
	}
	
}

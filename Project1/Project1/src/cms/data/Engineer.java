package cms.data;

public class Engineer extends Emp {
	private String proj;
	public Engineer() {
		// TODO Auto-generated constructor stub
	}
	public Engineer(int eid, String ename, double salary, String proj) {
		super(eid, ename, salary);
		this.proj=proj;
		// TODO Auto-generated constructor stub
	}
	public String getProj() {
		return proj;
	}
	public void setProj(String proj) {
		this.proj = proj;
	}

	public void getDetails() {
		// TODO Auto-generated method stub
		super.getDetails();
		System.out.println("Project is "+proj);
	}

}

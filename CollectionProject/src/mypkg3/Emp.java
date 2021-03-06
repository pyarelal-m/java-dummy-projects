package mypkg3;

public class Emp implements Comparable<Emp>
{
	private int eid;
	private String ename;
	private int sal;
	public Emp() {
		// TODO Auto-generated constructor stub
	}
	public Emp(int eid, String ename, int sal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
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
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return eid + " "+ename+" "+sal;
	}
		public int compareTo(Emp arg0) {
		int diff=this.getEid() - arg0.getEid();	
		System.out.println(this.getEid() + "  "+arg0.getEid());
			if(diff>0)
			{
				return 1;
			}
			else if(diff<0)
			{
				return -1;
			}
			else
			{
				return 0;
			}
		}
}

package cms;

public class Checking extends Account {
	private double c;
	public Checking() {

	}
	public Checking(double c) {
		this.c = c;
	
	

}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	@Override
	public void deposit() {
		System.out.println("  ");
		
	}
	@Override
	public void withdraw() {
		System.out.println("  ");

	}
}
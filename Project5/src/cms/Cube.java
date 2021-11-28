package cms;

public class Cube implements Shape,Shape3d{
	private double l;
	public Cube() {
		// TODO Auto-generated constructor stub
	}
	public Cube(double l) {
		super();
		this.l = l;
	}
	public double getL() {
		return l;
	}
	public void setL(double l) {
		this.l = l;
	}
	@Override
	public void volume() {
		System.out.println("Volume is "+(l*l*l));
	}
	@Override
	public void area() {
		System.out.println("Area  is "+(6*l*l));
	}
	
}

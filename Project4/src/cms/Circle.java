package cms;

public class Circle extends Shape{
	private double r;
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	public Circle(double r) {
		this.r = r;
	}
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	@Override
	public void area() {
		System.out.println("Area of Circle is "+(PI*r*r));
	}
	
}

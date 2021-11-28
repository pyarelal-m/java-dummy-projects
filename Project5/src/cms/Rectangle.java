package cms;

public class Rectangle implements Shape{
	private double l,b;
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	public Rectangle(double l, double b) {
		super();
		this.l = l;
		this.b = b;
	}
	public double getL() {
		return l;
	}
	public void setL(double l) {
		this.l = l;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	@Override
	public void area() {
		System.out.println("Area of Rectangle is "+(l*b));		
	} 
	
}

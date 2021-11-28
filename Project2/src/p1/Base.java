package p1;

public class Base {
	private int a=1;
	int b=2;
	protected int c=3;
	public int d=4;
	public Base() {
		System.out.println("p1.Base");
		System.out.println("private  "+a);
		System.out.println("default  "+b);
		System.out.println("protected  "+c);
		System.out.println("public  "+d);
	}
}

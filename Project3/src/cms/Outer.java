package cms;

public class Outer {
	int x=100;
	public void showOuter()
	{
		System.out.println("Outer Method");
		System.out.println("x ="+x);
		Inner ob=new Inner();
		ob.showInner();
	}
	
	class Inner
	{
		int y=10;
		public void showInner()
		{
			System.out.println("Inner Method");
			System.out.println("x ="+x);
			System.out.println("y = "+y);
		}
	}
	
	static class StaticInner
	{
		int z=300;
		public void showStaticInner()
		{
			System.out.println("Static Inner  Method");
			System.out.println("z =: "+z);
		}
	}
	
}
package cms;

public class MyStatic {
	static int a=10;
	int b=20;
	static {
		System.out.println("Static block executed only once");
		a=0;
	}
	public MyStatic() {
		a++;
		b++;
	}
	public static void showA()
	{
		System.out.println("Static var := "+a);
		//System.out.println("Normal var := "+b);
	}
	public void showB()
	{
		System.out.println("Static var := "+a);
		System.out.println("Normal var := "+b);
	}
	
}

package cms;

public class BoxingUnBoxing {

	public static void main(String[] args) {
		int a=100;
		System.out.println(a);
		
		// Converting Primitive to object  // Boxing
		Integer i=new Integer(a);
		System.out.println(a);
		
		//Converting an aobject to primitive // UnBoxing
		int x=i.intValue();
		System.out.println(x);
		
	}

}

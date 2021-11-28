package p1;

public class Normal {
public Normal() {
	Base ob=new Base();
	System.out.println("p1.Normal");
	//System.out.println("private  "+ob.a);
	System.out.println("default  "+ob.b);
	System.out.println("protected  "+ob.c);
	System.out.println("public  "+ob.d);
}
}

package p2;

import p1.Base;

public class SubClass1 extends Base {
public SubClass1() {
	System.out.println("p2.SubClass1");
	//System.out.println("private  "+a);
	//System.out.println("default  "+b);
	System.out.println("protected  "+c);
	System.out.println("public  "+d);
}
}

package cms;

public class Demo {

	public static void main(String[] args) {

			Outer o=new Outer();
			o.showOuter();
			
			System.out.println("===============");
			Outer.Inner oi=new Outer().new Inner();
			oi.showInner();
			
			System.out.println("===============");
			Outer.StaticInner osi=new Outer.StaticInner();
			osi.showStaticInner();
	}

}

package cms;

public class Demo {
	public static void main(String[] args) {
		Shape s;
		//s=new Shape(); // abstract class can not be instantiated
		s=new Circle(7.0);
		s.area();
		
		s=new Rectangle(4.0,5.0);
		s.area();
	}

}

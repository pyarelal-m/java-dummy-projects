package cms;

public class Demo {
	public static void main(String[] args) {
		Shape s;
		//s=new Shape(); // interface  can not be instantiated
		s=new Circle(7.0);
		s.area();
		
		s=new Rectangle(4.0,5.0);
		s.area();
		
		Cube c=new Cube(5.0);
		c.area();
		c.volume();
		
		s=c;
		s.area();
		
		Shape3d sd=c;
		sd.volume();
	}

}

package cms;

public class OverloadDemo {
	public static void main(String[] args) {
		Overload ob=new Overload();
		ob.add("aa","bb");
		ob.add(25.0,10.0);
		ob.add(25.0,10.0,5);
		double x[]={10,20,30,40,50};
		ob.add(x);
		ob.add(1,2,3,4,5,6);
	}

}

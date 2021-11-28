package cms;

public class Demo {

	public static void main(String[] args) {

		System.out.println(MyStatic.a);
		MyStatic.showA();
		
		MyStatic ob1=new MyStatic();
		ob1.showB();
		
		MyStatic ob2=new MyStatic();
		ob2.showB();		

	}

}

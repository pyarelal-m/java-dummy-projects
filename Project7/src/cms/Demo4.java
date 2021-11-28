package cms;

public class Demo4 {
	public static void main(String[] args) {
		Employee e1=new Employee(100,"king",24000.00) ;
		Employee e2=new Employee(101,"raja",20000.00) ;
		System.out.println(e1);
		System.out.println(e2);
		e1=null;
		e2=null;
		System.gc();
		System.out.println("END");
	}

}

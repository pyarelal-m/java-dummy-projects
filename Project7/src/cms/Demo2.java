package cms;

public class Demo2 {

	public static void main(String[] args) {
		Employee e1=new Employee(100,"king",24000.00) ;
		Employee e2=new Employee(100,"king",24000.00) ;

		if (e1==e2)
		{
			System.out.println("Matching");
		}
		else
		{
			System.out.println("NOT Matching");
		}
		
		if (e1.equals(e2))
		{
			System.out.println("Matching");
		}
		else
		{
			System.out.println("NOT Matching");
		}
		
	}

}

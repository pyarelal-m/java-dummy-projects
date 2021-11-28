package mypkg;

public class Demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Object class
		//static loading of a class
		Object obj = new java.util.Date();
		Class c=obj.getClass();
		System.out.println(c);
		System.out.println("The class of " + obj + " is " + c.getName());
		System.out.println("------------------------");
		try
		{
			//Dynamic loading of a class
			Class.forName("java.util.Date");
		}
		catch(ClassNotFoundException clEx)
		{
			clEx.printStackTrace();
		}	
		
	}

}











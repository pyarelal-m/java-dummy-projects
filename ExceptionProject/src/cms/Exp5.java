package cms;

public class Exp5
{
	public static void change(int x)  throws Exception
	{
		if (x<=2000)
		{
			// throw new NullPointerException();  // unchecked
			throw new Exception("Invalid Salary"); //checked
		}
	}
	public static void main(String args[])
	{
		int a=0;
		try
		{
			a=Integer.parseInt(args[0]);
			change(a);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());	
			e.printStackTrace();
		}
		
		System.out.println("The End");
	}
}

package cms;

public class Exp4
{
	public static void change(int x)
	{
		int y=55/x;
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
		}

		System.out.println("The End");
	}
}

package cms;

public class Exp7
{

public static void main(String args[]) throws SalException
{
	int a=0;
//	try
	//{
	a=Integer.parseInt(args[0]);
	if(a<=2000)
	{
	throw new SalException("Invalid salary");
	}
	//}
/*	catch(Exception e)
	{
	System.out.println(e.getMessage());
	}*/

	System.out.println("The End");
}
}
package cms;

public class Exp8
{

public static void main(String args[])
{
	int a=0;

	a=Integer.parseInt(args[0]);
	if(a>0)
	{
		System.out.println("Positive");
	}
	else
	{
		assert  a!=0:"0 can not be negative";
		System.out.println("Negative");
	}

	System.out.println("The End");
}
}
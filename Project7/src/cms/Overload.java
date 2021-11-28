package cms;

public class Overload {
	public void add(String a,String b)
	{
		System.out.println(a+b);
	}
	/*
	public void add(double a,double b)
	{
		System.out.println(a+b);
	}
	public void add(double a,double b,double c)
	{
		System.out.println(a+b+c);
	}
	
	
	public void add(double a[])
	{
		double sum=0.0;
		for(double  i:a)
		{
			sum+=i;
		}
		System.out.println(sum);
	}
	*/
	// variable arguments function
	public void add(double ... a)
	{
		
		double sum=0.0;
		for(double  i:a)
		{
			sum+=i;
		}
		System.out.println("Variable Arguments "+sum);
	}
	
	
}

package cms;

class A
{
	public void show() throws SalException
	{
		throw new SalException("Invalid salary");
	}
}
class B extends A
{
	public void show() throws Exception
	{
		throw new Exception();
	}
}
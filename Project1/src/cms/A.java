package cms;

public final class A {
	public final void show()
	{}
}

// final class can not be subclassed or inherited
class B extends A
{
	//can not override final method
	public void show()
	{}
}

package cms;
interface A
{
	public void showA();
}
interface B extends A
{
	public void showB();
}

public class Test implements B{

	@Override
	public void showA() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showB() {
		// TODO Auto-generated method stub
		
	}

}

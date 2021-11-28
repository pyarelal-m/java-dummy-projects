package cms;
abstract class Bonus
{
	public abstract void calBonus(double amount);
}


public class Demo5 {
	public static void main(String[] args) {
		
		Bonus ob=new Bonus()
		{	// generates subclass of Bonus class without any name
			// hence annonymous class
			public void calBonus(double amount)
			{
				System.out.println("Bonus is "+(amount * 0.10));
			}
		}; // end
		
		ob.calBonus(10000.00);
	}

}

package cms;
interface Tax
{
	public void caltax(double amount);
}

public class Demo6 {
	public static void main(String[] args) {
		Tax ob=new Tax()
		{ //iterface implementation class // annonymous class
			public void caltax(double amount) {
			System.out.println("Tax is "+(amount*0.20));	
			}
		};
		ob.caltax(10000.00);

	}

}

package cms;

public class MyFinal {
	final int a=100;
	final int b;	// blank final variable
	public MyFinal() {
		//a=200;  // Final variable value remains constant
		b=200;
		//blank final variable can be initialized only in every 
		//constructor once
	}
	public void disp(final int x)
	{
		// x=300; //  final parameter remains constant though out method
		final int y=300;  //local variable also can be final
	}
	
}

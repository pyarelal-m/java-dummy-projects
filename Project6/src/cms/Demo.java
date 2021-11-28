package cms;

public class Demo {


	public static void main(String[] args) {
		Account a;
		a=new Saving(10000.00);
		a.deposit();
		a.withdraw();
		a.show();
	}

}

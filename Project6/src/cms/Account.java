package cms;

public abstract class Account {
	int aid=1;
	String holder="raaja";
	double balance=10000.00;
	
	public abstract void deposit();
	public abstract void withdraw();
	public void show()
	{
		System.out.println("information ="+aid+holder+balance);
	}
	      
	
}

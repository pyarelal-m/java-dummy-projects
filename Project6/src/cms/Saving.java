package cms;

public class Saving extends Account  {
private double s;
public Saving() {
	}
public Saving(double s) {
	this.s = s;
}

public double getS() {
	return s;
}
public void setS(double s) {
	this.s = s;
}
@Override
public void deposit() {
	System.out.println("After Deposit Bal is "+balance);
}
@Override
public void withdraw() {
	System.out.println("After Withdraw Bal is" +balance);
}





}

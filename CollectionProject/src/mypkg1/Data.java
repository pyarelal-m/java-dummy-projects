package mypkg1;

public class Data<T> {
private T t;
public Data() {
	// TODO Auto-generated constructor stub
}
public T getT() {
	return t;
}
public void setT(T t) {
	this.t = t;
}
@Override
	public String toString() {
		String s=t.getClass().getName();
		return "Type is  "+s +
				"  , value is"+t;
	}
}

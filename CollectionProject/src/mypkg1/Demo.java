package mypkg1;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data<String> d1=new Data<>();
		d1.setT("This is a String");
		System.out.println(d1);
		Data<Integer> d2=new Data<>();
		d2.setT(1000);
		System.out.println(d2);
		Data<Object> d3=new Data<>();
		d3.setT(1000);
		System.out.println(d3);
		d3.setT("Hello");
		System.out.println(d3);
		//d3=d2;   // Data<Object > d3=d2; // error
		//d3=d1;
		Data<? extends Object> d4=d2;
		System.out.println(d4);
	}

}

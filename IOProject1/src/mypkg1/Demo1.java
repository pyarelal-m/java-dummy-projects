package mypkg1;

import java.util.Scanner;

public class Demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String param = s.next();
		System.out.println("the param 1" + param);
		int value = s.nextInt();
		System.out.println("second param" + value);
		double val = s.nextDouble();
		System.out.println("third param" + val);
		
		s.close();
	}

}








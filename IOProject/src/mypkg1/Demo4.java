package mypkg1;

import java.io.PrintWriter;

public class Demo4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// character stream class always wraps byte stream class
        PrintWriter pw  = new PrintWriter(System.out,true);
        pw.println(" This is a String ");
        int i = -7;
        pw.println(i);
        double d = 4.5e-7;
        pw.println(d);
	}

}

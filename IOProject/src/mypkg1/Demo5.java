package mypkg1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	       char c;
	       BufferedReader br = new BufferedReader(	new InputStreamReader(System.in));
	      //			stores into buffer  || converts into charstream || console-- byte strean
	       System.out.println("Enter t to quit ");
	       do
		   {
	          c = (char)br.read();
	          System.out.println(c);
	       }while(c != 't');
	}

}

package mypkg1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo6 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	       String c;
	 BufferedReader br = new BufferedReader(	new InputStreamReader(System.in));
	      //			stores into buffer  || converts into charstream || console-- byte strean
	       System.out.println("Enter stop  to quit ");
	       do
		   {
	          c = br.readLine();
	          
	          System.out.println(c);
	       }while(!c.equalsIgnoreCase("stop"));
	}

}

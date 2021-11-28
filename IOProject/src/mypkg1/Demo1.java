package mypkg1;
import java.io.IOException;
public class Demo1 {
	public static void main(String[] args) throws IOException {
		int n;
		char c;
		do
		{
			System.out.println("enter a character");
			n=System.in.read();  // in is object of InputStream class // throws IOException
			c=(char) n;
			  System.out.println("you entered   "+ c);
		}while(c!='q');
	}
}

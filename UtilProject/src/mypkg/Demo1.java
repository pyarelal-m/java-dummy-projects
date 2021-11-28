package mypkg;
import java.util.StringTokenizer;
public class Demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st1 = new StringTokenizer("Java|StringTokenizer|Example 1", "|");     
		//iterate through tokens    
		while(st1.hasMoreTokens())      
			System.out.println(st1.nextToken());
		System.out.println("=============");
		
		StringTokenizer st2 = new StringTokenizer("Java|StringTokenizer|Example 2");     
		//iterate through tokens    
		while(st2.hasMoreTokens())      
			System.out.println(st2.nextToken("|"));
		System.out.println("=============");
	}

}

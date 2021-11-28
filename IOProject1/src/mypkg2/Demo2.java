package mypkg2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class Demo2 {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//Date o=null;
		Point o=null;
		
		FileInputStream fi=new FileInputStream("objectdata.txt");
		ObjectInputStream dsi=new ObjectInputStream( fi);
		//o= (Date) dsi.readObject();  // De serialization
		o= (Point) dsi.readObject();  // De serialization
		System.out.println(o);
		System.out.println(o.me);
	}

}

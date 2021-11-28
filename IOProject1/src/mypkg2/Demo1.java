package mypkg2;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;
public class Demo1 {
	public static void main(String[] args) throws IOException {
			//Date o=new Date();
		  	Point o=new Point(4,5);
		  	o.me=555;
			System.out.println(o);
			FileOutputStream fo=new FileOutputStream("objectdata.txt");
			ObjectOutputStream dso=new ObjectOutputStream( fo);
			dso.writeObject(o); // Serialization
			// object -> bytestream
	}

}

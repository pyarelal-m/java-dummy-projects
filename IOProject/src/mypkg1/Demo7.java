package mypkg1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo7 {
	public static void main(String[] args) {
	     try  {
	         FileReader input = new FileReader("AA");
	          try  {
	             FileWriter output = new FileWriter("io1.txt");
	             try  {
	                 char[] buffer = new char[128];
	                 int charsRead;
	                  // read the  first  line chars  and put it into char array i.e buffer
	                  charsRead = input.read(buffer);
	                   while ( charsRead != -1 ) {
	                      // write buffer to the output file
	                      output.write(buffer, 0, charsRead);
	                     // read the next buffer line
	                      charsRead = input.read(buffer);
	                     }
	                 } finally {
	                  output.close();}
	              } finally {
	              input.close();}
	         } catch (IOException e) {
	          e.printStackTrace();
	         }
	}

}

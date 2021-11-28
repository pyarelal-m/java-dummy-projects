package mypkg1;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo3 {
	public static void main(String[] args) {
		try
		{
		FileInputStream fi=new FileInputStream("AA");
		FileOutputStream fo=new FileOutputStream("BB.txt");
		int i=0;
		 do          {
		      i = fi.read(); // read a char from inuput file
          		if(i != -1)
      			fo.write(i); // if not end of the file then write a char into output file
         }while( i != -1);
		}
		catch(FileNotFoundException e)   	{
			e.printStackTrace();		
		}
		catch(IOException e)  		{
			e.printStackTrace();		
		}
		System.out.println("Work is done");
	}

}

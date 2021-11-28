package mypkg1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo8 {
	public static void main(String[] args) {
	     try{
	    	 File f1=new File("AA");
	    	 FileReader input =null;
	    	 if (f1.exists())	    		 
	          input = new FileReader(f1);
	         BufferedReader bufInput = new BufferedReader(input);
	        try{
	        	File f2=new File("io2.txt");
	             FileWriter output = new FileWriter(f2);
	             BufferedWriter bufOutput= new BufferedWriter(output);
	             try{
	                 String line;
	                 // read the first line
	                 line = bufInput.readLine();
	                     while ( line != null ) {
	                     // write the line out to the output file
	                     bufOutput.write(line, 0, line.length());
	                     bufOutput.newLine();
	                     bufOutput.newLine();
	                     bufOutput.newLine();
	                     // read the next line
	                     line = bufInput.readLine();
	                     }
	                 } finally { bufOutput.close();  }
	             } finally {  bufInput.close();   }
	        } catch (IOException e) {  e.printStackTrace();  }
	}
}

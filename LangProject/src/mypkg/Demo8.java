package mypkg;

import java.util.Properties;

public class Demo8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 long lngStart, lngEnd = 0;
		    System.out.println("Timing a for from 0 to 1,000,000");
		    
		    //time a for loop from 0 to 1,000,000
		    lngStart=System.currentTimeMillis();

		    for(int j=0;j<1000000;j++) 		    
		      lngEnd = System.currentTimeMillis();

		    System.out.println("Elapsed time : " + (lngEnd-lngStart));
		    
		    System.out.println("-----------------------------");
		    long lngStart1=0, lngEnd1 = 0;
		    System.out.println("Timing a for from 0 to 1,000,000");
		    
		    //time a for loop from 0 to 1,000,000
		    lngStart1=System.nanoTime();

		    for(int j=0;j<1000000;j++) 		    
		      lngEnd1 = System.nanoTime();

		    System.out.println("Elapsed time : " + (lngEnd1-lngStart1)+ " ns");

		    System.out.println("-----------------------------");
		    
		    
		    Properties pList=System.getProperties();
		    pList.list(System.out);

		    System.out.println("-----------------------------");
		    
		    String strOSName = System.getProperty("os.name");
		    System.out.print("Get OS name example.. OS is ");
		    if(strOSName != null)
		    {
		    	if(strOSName.toLowerCase().indexOf("windows") != -1)
		    		    System.out.println("Windows");
		        else
		        		System.out.print("not windows");
		     }
		    
		    String classpath = System.getProperty("java.class.path");
		    System.out.print("Classpath  is "+classpath);
		    System.out.println("-----------------------------");
		    
		   // Runtime finalization
		    System.out.println("Suggesting JVM to run finalize method");
		    System.runFinalization();
		    System.out.println("Suggested JVM to run finalize method");
		   
		    // Garbage Collection
		    System.out.println("Suggesting VM to run garbage collector");
		    System.gc();
		    System.out.println("Suggested VM to garbage collect objects");

		    // Exiting Program
		    System.out.println("Exiting current virtual machine");
		    // 0 indicates normal exit
		    // Other than 0 indicates abnormal exit
		    System.exit(0);
		    System.out.println("This will not be printed");
	    
	}
}

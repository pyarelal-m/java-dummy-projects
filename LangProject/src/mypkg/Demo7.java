package mypkg;

public class Demo7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer stringBuffer1 = new StringBuffer();
	    System.out.println(stringBuffer1.length());
	    System.out.println(stringBuffer1.capacity());
	    
	    
		 StringBuffer stringBuffer = new StringBuffer("Hello World");
		   
		System.out.println(stringBuffer);
		System.out.println(stringBuffer.capacity());
		    
		System.out.println(stringBuffer.length());
		System.out.println(stringBuffer.capacity());
		
		System.out.println (stringBuffer.append("    Welcome to TCS"));
		
		System.out.println(stringBuffer.length());
		System.out.println(stringBuffer.capacity());
	}

}

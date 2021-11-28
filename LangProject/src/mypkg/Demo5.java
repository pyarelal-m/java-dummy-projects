package mypkg;

public class Demo5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		byte[] bytes = {2, 4, 6, 8};
		byte[] bytes1 = {'T', 'C', 'S', '-'};

    	char[] characters = {'a', 'b', 'C', 'D'};

    	StringBuffer strBuffer = new StringBuffer("abcde");

//    	Examples of Creation of Strings

    	String byteStr = new String(bytes);      
    	String byteStr1 = new String(bytes1);

    	String charStr = new String(characters); 

    	String buffStr = new String(strBuffer);

    	System.out.println("byteStr : "+byteStr);
    	System.out.println("byteStr : "+byteStr1);

    	System.out.println("charStr : "+charStr);
    	

    	System.out.println("buffStr : "+buffStr);



	}

}

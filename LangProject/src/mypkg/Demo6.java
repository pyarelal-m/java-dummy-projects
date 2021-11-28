package mypkg;

public class Demo6 {
	public static void main(String[] args) {
		String str1=new String("");
		String str2="This is a String object created by us.This is a demo ....xxxxxx";
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("=================");
		// length()
		System.out.println("No of characters in str1 = "+str1.length());
		System.out.println("No of characters in str2 = "+str2.length());
		System.out.println("=================");
		// replace
		System.out.println("Replacing x  with $ in str2 ");
		System.out.println(str2.replace('x','$'));
		System.out.println("Replacing is  with was in str2 ");
		System.out.println(str2.replace("is","was"));
		System.out.println("Replacing First is  with was in str2 ");
		System.out.println(str2.replaceFirst("is","was"));
		System.out.println("=================");
		//split()
		String sp[]=null;
		sp=str2.split(" ");
		for (String s:sp)
		{
			System.out.println(s);
		}
		System.out.println("--------------");
		String ss="dd-mm-yyyy";
		sp=ss.split("-");
		for (String s:sp)
		{
			System.out.println(s);
		}
		System.out.println("=================");
		
		// endsWith() , startsWith()
		if(str2.endsWith("x"))
		{
				System.out.println("String ends with x");
		}
		else
		{
				System.out.println("String does not end with x");
		}
		
		if(str2.startsWith("x"))
		{
				System.out.println("String starts with x");
		}
		else
		{
				System.out.println("String does not start with x");
		}
		
		System.out.println("=================");
		
		// toLowerCase() , toUpperCase()
		System.out.println("Lower case string "+str2.toLowerCase());
		System.out.println("Upper case string "+str2.toUpperCase());
		System.out.println("=================");
		
		//substring(which position , to what position )
		 System.out.println(str2.substring(0,5));
		 System.out.println(str2.substring(5));
		System.out.println("=================");

		//converting String to character Array
		char ch[]=null;
		ch=str2.toCharArray();
		for (int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);			
		}
		
		System.out.println("=================");
	}
}

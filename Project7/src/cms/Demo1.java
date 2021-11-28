package cms;

public class Demo1 {

	public static void main(String[] args) {
		//String s1="CMS";
		//String s2="CMS";
		
		//String s1=new String("CMS");
		//String s2=new String("CMS");
		
		String s1=new String("CMS");
		String s2=new String("Cms");
		
		if (s1==s2)
		{
			System.out.println("Matching with Case");
		}
		else
		{
			System.out.println("NOT Matching with Case");
		}

		if (s1.equals(s2))
		{
			System.out.println("Matching with Case");
		}
		else
		{
			System.out.println("NOT Matching with Case");
		}

		if (s1.equalsIgnoreCase(s2))
		{
			System.out.println("Matching with Case");
		}
		else
		{
			System.out.println("NOT Matching with Case");
		}
		
		
	}

}

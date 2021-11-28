package mypkg;

public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//   ClassLoader loader = new NetworkClassLoader(host, port);
		//   Object main = loader.loadClass("Main", true).newInstance();
		// Classloader
		//The basic principle is that classes are only loaded when needed
		ClassLoader loader = ClassLoader.getSystemClassLoader();
		Class c=null;
		try
		{
			// another way of loading class dynamically
		 c=loader.loadClass("java.util.Date");
			System.out.println("Class loaded into memory");
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();			
		}
		System.out.println(c);
		System.out.println(c.getName());
		

		 
		

	}

}

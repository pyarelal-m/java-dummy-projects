package cms.test;

import cms.data.Employee;
import cms.data.Manager;

public class Demo1 {

	public static void main(String[] args) {
		Employee ob=new Manager(101, "Raja", 30000.00, "IT");
		ob.getDetails();
		//String d=ob.getDept();  // subclass method can not be invoked
		if(ob instanceof Manager)
		{
			System.out.println("Emp points to Manager Object");
		}
		
		Manager m=(Manager)  ob;  // Object
		String d=m.getDept();
		System.out.println(d);
		
		
		
		
		
	}

}

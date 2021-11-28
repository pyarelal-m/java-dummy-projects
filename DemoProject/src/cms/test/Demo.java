package cms.test;

import cms.data.Employee;
import cms.data.Engineer;
import cms.data.Manager;

public class Demo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee ob=new Employee(100,"King",24000.00);
		ob.getDetails();
		
		Manager m=new Manager(101, "Raja", 30000.00, "IT");
		m.getDetails();
		
		Engineer en=new Engineer(102, "Don",20000.00, "Dabhol");
		en.getDetails();
	}

}

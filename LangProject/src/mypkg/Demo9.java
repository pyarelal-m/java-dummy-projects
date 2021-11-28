package mypkg;

public class Demo9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Customer c = new Customer("Angel", 9000);
			System.out.println(c);
			System.out.println("The Customer name is " + c.getName());
			System.out.println("The Customer pay is " + c.getIncome());

			// shallow clone
			Customer cClone = (Customer) c.clone();
			System.out.println(cClone);
			System.out.println("The clone's name is " + cClone.getName());
			System.out.println("The clones's pay is " + cClone.getIncome());
			cClone.setName("Joel");
			System.out.println(cClone.getName());
			System.out.println(c.getName());

		} catch (CloneNotSupportedException cnse) {
			System.out.println("Clone not supported");
		}

	}

}







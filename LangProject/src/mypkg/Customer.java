package mypkg;

public class Customer implements  Cloneable
{
	 String name;
	 int income;

	 public Customer(String name, int income) {
	  this.name = name;
	  this.income = income;
	 }

	 public Customer() {
	 }

	 public String getName() {
	  return name;
	 }

	 public void setName(String name) {
	  this.name = name;
	 }

	 public void setIncome(int income) {
	  this.income = income;
	 }

	 public int getIncome() {
	  return this.income;
	 }

	 public Object clone() throws CloneNotSupportedException {
	 
	   try {
	   return super.clone();
	  }
	  catch (CloneNotSupportedException cnse) 
	  {
	   System.out.println("CloneNotSupportedException thrown " + cnse);
	   throw new CloneNotSupportedException();
	  }
	 }
}












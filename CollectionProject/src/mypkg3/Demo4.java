package mypkg3;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo4 {

	public static void main(String[] args) {
		Comparator<Emp> c=new SalComp<>();
		Comparator<Emp> c1=new NameComp<>();
		
		//TreeSet<Emp> t=new TreeSet<>(c1);
		TreeSet<Emp> t=new TreeSet<>(c);
		t.add(new Emp(101,"ccc",12000));
		t.add(new Emp(100,"king",20000));
		t.add(new Emp(102,"ajay",17000));
		t.add(new Emp(105,"leena",10000));
		
		for(Emp s:t)
		{
			System.out.println(s);
		}

	}

}

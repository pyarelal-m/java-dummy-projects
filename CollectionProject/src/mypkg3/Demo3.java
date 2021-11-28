package mypkg3;

import java.util.TreeSet;

public class Demo3 {
	public static void main(String[] args) {
		TreeSet<Emp> t=new TreeSet<>();
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

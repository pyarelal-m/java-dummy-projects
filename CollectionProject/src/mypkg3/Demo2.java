package mypkg3;

import java.util.TreeSet;

public class Demo2 {
	public static void main(String[] args) {
		TreeSet<Integer> t=new TreeSet<>();
		t.add(11);
		t.add(5);
		t.add(25);
		t.add(7);
		for(Integer s:t)
		{
			System.out.println(s);
		}

	}

}

package mypkg3;
import java.util.*;
public class Demo1 {
	public static void main(String[] args) {
			TreeSet<String> t=new TreeSet<>();
			t.add("one");
			t.add("two");
			t.add("abcd");
			t.add("three");
			for(String s:t)
			{
				System.out.println(s);
			}

	}

}

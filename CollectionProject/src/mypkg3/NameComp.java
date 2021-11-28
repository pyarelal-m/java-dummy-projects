package mypkg3;

import java.util.Comparator;
public class NameComp<T> implements Comparator<Emp>{
	@Override
	public int compare(Emp arg0, Emp arg1) {
		String n1=arg0.getEname();
		String n2=arg1.getEname();
		int diff=n1.compareTo(n2);
		if(diff>0)
		{
			return 1;
		}
		else if(diff<0)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}

}

package mypkg3;

import java.util.Comparator;

public class SalComp<T>  implements Comparator<Emp>{

	@Override
	public int compare(Emp arg0, Emp arg1) {
			int diff=arg0.getSal()-arg1.getSal();
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

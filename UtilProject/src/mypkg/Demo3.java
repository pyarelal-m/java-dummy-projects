package mypkg;

import java.util.TimeZone;

public class Demo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TimeZone tz = TimeZone.getTimeZone("America/Los_Angeles");
		 TimeZone tz1 = TimeZone.getDefault();
		 System.out.println(" America/Los_Angeles Timezone="+tz.getDisplayName());
		 System.out.println(" Default="+tz1.getDisplayName());
		 System.out.println();
		System.out.println();

	}

}

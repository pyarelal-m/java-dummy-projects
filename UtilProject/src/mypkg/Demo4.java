package mypkg;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d=new Date();
		System.out.println(d);
		
		// deprecated method
		d.setDate(4);
		d.setMonth(4);
		d.setYear(2010);
		System.out.println(d);
		
		// finding the difference  in time
		Date d1 = new Date();  
		System.out.println("Today is " + d1);
		//make interval of 10 millisecond before creating second date object        
		try
		{      
		Thread.sleep(10000);    
		}catch(Exception e){    } 
		Date d2 = new Date();
		System.out.println("First Date : " + d1 +" "+d1.getTime());    
		System.out.println("Second Date : " + d2+" "+d2.getTime());
		System.out.println("difference between 2 dates ="+(d2.getTime() -d1.getTime() ));
		
		System.out.println("Is second date after first ? : " + d2.after(d1));
		
		System.out.println("--------Comparing 2 dates---------");
		int results = d1.compareTo(d2);     
		if(results > 0)      
			System.out.println("First Date is after second");    
		else if (results < 0)      
			System.out.println("First Date is before second");    
		else      
			System.out.println("Both dates are equal");
		
		
		
		
		// Another way of creating user defined date
		SimpleDateFormat sdf = new SimpleDateFormat ( "MM/dd/yyyy" ) ; 
		String myDate="07/08/2010";
		try
		{
			d= sdf.parse(myDate);
		}
		catch(ParseException e)
		{
			e.printStackTrace();			
		}
		
		System.out.println(d);
		
		// Another way of creating user defined date
		SimpleDateFormat sdf1 = new SimpleDateFormat ( "MM/dd/yyyy" ) ;
		
		
		Calendar c1=Calendar.getInstance();
		System.out.println("c1.get(Calendar.YEAR): " + c1.get(Calendar.YEAR));
		System.out.println("c1.get(Calendar.MONTH): " + c1.get(Calendar.MONTH));
		System.out.println("c1.get(Calendar.DATE): " + c1.get(Calendar.DATE));
		
		c1.set(1999,0 ,20); //(year,month,date)
		System.out.println("c1.set(1999,0 ,20) : "+c1.getTime());
		c1.add(Calendar.DATE,5);
		System.out.println("Date + 5 days is : " + sdf1.format(c1.getTime()));
		System.out.println("c1.getTime() : "+c1.getTime());
		
		Calendar c2=Calendar.getInstance();
		System.out.println("c2.getTime() : "+c2.getTime());
		
		System.out.println("c1.before(c2) : "+c1.before(c2));
		System.out.println("c1.after(c2) : "+c1.after(c2));
		System.out.println("c1.equals(c2) : "+c1.equals(c2));
	}

}

/*PREPARE STATEMENsT*/

import java.sql.*;
import java.util.Scanner;

class simple5
{
	public static void main(String[] args) //throws Exception
	{
		try
		{
			 Class.forName("com.mysql.jdbc.Driver");
			  Connection con = DriverManager
						.getConnection("jdbc:mysql://localhost:3306/test","root", "app");
			  System.out.println("Connected");
			  
			  Scanner sc=new Scanner(System.in);
		System.out.println("\n sNO code : ");
		int sno=sc.nextInt();

		System.out.println("\n SNAME  : ");
		
		String sname=sc.next();

		System.out.println("\n LOCATION : ");
		
		String sloc=sc.next();

             PreparedStatement pst=con.prepareStatement("insert into java values(?,?,?)");
             pst.setInt(1,sno);
             pst.setString(2,sname);
             pst.setString(3,sloc);

			int i=pst.executeUpdate();
			System.out.println("i : " + i);

		}
		catch(Exception e){e.printStackTrace();}
	}
}














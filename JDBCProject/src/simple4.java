import java.sql.*;

class  simple4
{
	public static void main(String[] args) //throws Exception
	{
		try
		{
			 Class.forName("com.mysql.jdbc.Driver");
			  Connection con = DriverManager
						.getConnection("jdbc:mysql://localhost:3306/test","root", "app");
			  System.out.println("Connected");
			  con.setAutoCommit(true);
			  Statement st=con.createStatement();

			  //st.executeUpdate("Create table movie (movie_no int, movie_name varchar(20), Theatre_loc varchar(20) )");
			  
			   int i=st.executeUpdate("insert  into   movie values  (10, 'Vinay','Mumbai')");
	 			i+=st.executeUpdate("insert  into   movie values  (20, 'Jay','Pune')");
	 			i+=st.executeUpdate("insert  into   movie values  (30, 'amit','Pune')");
	 			i+=st.executeUpdate("insert  into   movie values  (40, 'aditi','Mumbai')"); 
			 
			  //int i=st.executeUpdate("update java set loc ='BBSR' where loc='Pune' ");

			 // int i=st.executeUpdate("delete from   java  where loc ='BBSR' ");

			  //st.executeUpdate("drop table dept");

ResultSet rs=st.executeQuery("selec1t * from movie");
while(rs.next())
{
	System.out.print(rs.getInt(1)+ " \t"  );
	System.out.print(rs.getString(2) + "\t");
	System.out.println(rs.getString(3) + "\t");
}

	System.out.println("No. of rows inserted : " + i);
	//System.out.println("No. of rows updated : " + i);
	//System.out.println("No. of rows deleted : " + i);
		}

		catch(Exception e)
		{
			System.out.println("FROM EXCEPTION "+e.getMessage());
			e.printStackTrace();
		}
	}
}

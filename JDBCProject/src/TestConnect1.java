import java.sql.*;
class TestConnect1
{
      public static void main(String args[])
      {
		  try
		  {
			  Class.forName("com.mysql.jdbc.Driver");
			  Connection conn = DriverManager
						.getConnection("jdbc:mysql://localhost:3306/test","root", "app");
			  System.out.println("Connected");
			  Statement st=conn.createStatement();
			  ResultSet rs=st.executeQuery("Select * from movie");
			  while(rs.next())
			  {
				  	int i=rs.getInt("movie_no");
				  	String s=rs.getString("movie_name");
				  	String l=rs.getString("theatre_loc");
				  	System.out.println("movie no :=  "+i);
				  	System.out.println("movie name is := "+s);
				  	System.out.println("theatre  location is := "+l);
				  	System.out.println(" ------------------------------- ");
			  }

     }catch(Exception e)
     { e.printStackTrace();
		 System.out.println("Idiot, not connected"+e);}
      }

}

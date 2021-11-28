package mypkg1;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class RBDemo {
	public static void main(String[] args) {
		String srbName = "mypkg1.ConnectJ";
		String sDriverKey = "CSDriver";
		String  sURLKey="CSURL";
		 try  // get the PropertyResourceBundle
		    {
		      ResourceBundle rbConnect = ResourceBundle.getBundle( srbName );

		     String  sDriver   = rbConnect.getString( sDriverKey );
		    System.out.println("Value of sDriver:"+sDriver);

		      String sURL      = rbConnect.getString( sURLKey );
		     System.out.println("Value of sURLKey:"+sURL);
		    }
		    catch( MissingResourceException mre )
		    {
		      System.err.println( "ResourceBundle problem for " +  srbName + ", program ends." );
		      System.err.println("Specific error: " +  mre.getMessage() );
		      
		    }

	}

}

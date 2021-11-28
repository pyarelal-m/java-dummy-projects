package mypkg1;

import java.io.Console;

public class Demo10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean userValid=false;
		Console cons = System.console();
		 if (cons != null) {
		     String userTyped; String pwdTyped;
		     do {
		         userTyped = cons.readLine("%s", "User name: ");
		         pwdTyped = new String(cons.readPassword("%s", "Password: "));
		         if (userTyped.equals("oracle") && pwdTyped.equals("tiger")) {
		            userValid = true;
		         } else {
		           System.out.println("Wrong user name/password. Try again.\n");
		         }
		     } while (!userValid);
		 }
	}

}

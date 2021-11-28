package mypkg;
import java.io.IOException;
public class Demo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Runtime 
		//Process
		
		try
		{
			Runtime runp=Runtime.getRuntime();
			Process process; //= runp.exec("C:\\Program Files\\WinZip\\WINZIP32.exe");
			process=runp.exec("C:\\Program Files\\Internet Explorer\\iexplore.exe");
			//process.getOutputStream();//OutputStream
			//process.getInputStream();//InputStream
			
		}
		catch(IOException ioEx)
		{
			ioEx.printStackTrace();
		}
	}

}










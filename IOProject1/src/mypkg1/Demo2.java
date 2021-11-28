package mypkg1;
import java.io.*;
public class Demo2 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fo=new FileOutputStream("javadata.txt");
		DataOutputStream dso=new DataOutputStream( fo);
		dso.writeBoolean(true);
		dso.writeInt(44);
		dso.writeUTF("This is a string");
		
		dso.close();
		fo.close();
		FileInputStream fi=new FileInputStream("javadata.txt");
		DataInputStream dsi=new DataInputStream(fi);
		boolean b=dsi.readBoolean();
		System.out.println(b);
		int a=dsi.readInt();
		System.out.println(a);
		String s=dsi.readUTF();
		System.out.println(s);
		
		
		
		
		
	}

}

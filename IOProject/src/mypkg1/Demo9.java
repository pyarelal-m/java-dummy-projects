package mypkg1;

import java.io.File;
import java.util.Date;

public class Demo9 { 

	public static void main(String[] args) {
		File f1=new File("io2.txt");
		File f2=new File("C:\\afee","Demo.java");
		File f3=new File("C:\\afee");
		System.out.println("f1.isFile() : "+f1.isFile());  // true
		System.out.println("f2.isFile() : "+f2.isFile());  // true
		System.out.println("f3.isFile() : "+f3.isFile());	//false
		System.out.println("f3.isDirectory() : "+f3.isDirectory());	//true

		System.out.println("f1.getName() : "+ f1.getName());
		System.out.println("f1.getPath() : "+ f1.getPath());
		System.out.println("f1.getAbsolutePath() : "+ f1.getAbsolutePath());
		System.out.println("f1.getParent() : "+ f1.getParent());
		System.out.println("f1.lastModified() : "+new Date( f1.lastModified()));
		System.out.println("f1.length() : "+ f1.length());
		System.out.println("f2.getName() : "+ f2.getName());
		System.out.println("f2.getPath() : "+ f2.getPath());
		System.out.println("f2.getAbsolutePath() : "+ f2.getAbsolutePath());
		System.out.println("f2.getParent() : "+ f2.getParent());
		System.out.println("f2.lastModified() : "+ f2.lastModified());
		System.out.println("f2.length() : "+ f2.length());

		String s[]=f3.list();
		for(int i=0;i<s.length;i++)
		{
			File f=new File("C:\\afee", s[i]);
			if(f.isFile())
			{
				System.out.println(s[i]  +"\t file");
			}
			else
			System.out.println(s[i]  +"\t dir");
		}
	}
}

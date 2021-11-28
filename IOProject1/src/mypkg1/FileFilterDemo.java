package mypkg1;

import java.io.File;

public class FileFilterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("c:\\java");
		
		String filename[]=f.list();
		
		for(int i=0;i<filename.length;i++)
		{
				File ff=new File("c:\\java"+filename[i]);
				MyFilter ob=new MyFilter(".java");
				if (ob.accept(ff,filename[i] ))
				{
						System.out.println(filename[i]+"  Java source file");
					
				}
			
		}
	}

}

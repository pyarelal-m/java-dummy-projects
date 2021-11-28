package mypkg1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class RandomFileDemo1 {
	public static void main(String[] args) throws Exception {
		File f=new File("MyRandom.txt");
		RandomAccessFile raf=new RandomAccessFile(f,"rw");

		String str="I am exploring Mumbai";
		raf.seek(10);
		raf.writeBytes(str);

		long fp=raf.getFilePointer();

		String str1="  on weekends";
		raf.seek(fp+1);
		raf.writeBytes(str1);

	}

}

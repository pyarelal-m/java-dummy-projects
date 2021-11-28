package mypkg1;
import java.io.File;
import java.io.FilenameFilter;
public class MyFilter implements FilenameFilter {

	String ext;
	public MyFilter() {
		// TODO Auto-generated constructor stub
	}
	
	public MyFilter(String ext) {
		super();
		this.ext = ext;
	}

	@Override
	public boolean accept(File f, String sname) {
		// TODO Auto-generated method stub
		return  sname.endsWith(ext);
	}

}


















package Port;

import cms.HttpException;

public class Exception {

	
	public static void main(String[] args) throws HttpException {
		int a=0;
		a=Integer.parseInt(args[0]);
		try{
		if(a!=80)
		{
		throw new HttpException("Invalid port");
		}
	}
	finally{
		System.out.println("The End");
	}
	
	}

}

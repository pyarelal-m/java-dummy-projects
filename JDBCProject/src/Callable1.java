import java.sql.*;
//import oracle.jdbc.driver.*;

class Callable1
{
	public static void main(String[] args) //throws Exception
	{
		try
		{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
        System.out.println("Connected");

	System.out.print("\n Dept number : ");
	byte[] b=new byte[100];
	int cnt=System.in.read(b);
	String tpno=new String(b,0,cnt-2);
	int tno=Integer.parseInt(tpno);


	CallableStatement cst=con.prepareCall (  "{call dept_proc(?,?)}"   );
			cst.setInt(1,tno);

			cst.registerOutParameter(2,java.sql.Types.VARCHAR);

			boolean bo=cst.execute();
			String nm=cst.getString(2);
			System.out.println(nm);


//			System.out.println("Value of bo : " + bo);
			//ResultSet rs=cst.executeQuery();

			/*while(rs.next())
			{
				String tname=cst.getString(2);
				System.out.println("Name : "  + tname);
			}*/
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}


/*

create or replace procedure dept_proc(did in number,d_name out varchar2) is
begin
select dname into d_name from dept where deptno=did;
end;
/




















*/
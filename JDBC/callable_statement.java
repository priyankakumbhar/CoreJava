package JDBC;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class callable_statement {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		CallableStatement cs=null;
		Connection con=null;
		try
		{
			//Class.forName("com.mysql.cj.jdbc.Driver");
			//con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentData", "root", "root");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "HR", "hr");
			System.out.println("Connection Successfull");
			cs=con.prepareCall("{call insert_Details(?,?,?,?,?,?)}");
			//set parameter
		//	AccNo Number,CustName Varchar2,Bal Number, AccType varchar2,Addr Varchar2,Phoneno Number
			cs.setInt(1,100);
			cs.setString(2,"Priyanka");
			cs.setInt(3, 10000);
			cs.setString(4,"Saving");
			cs.setString(5, "Pune");
			cs.setInt(6,235667786);
			cs.execute();
			System.out.println("Account is Create Successfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			cs.close();
			con.close();
		}
	}

}

package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
//insert using Statement 
public class insertRecord {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Statement stmt=null;
		Connection con=null;
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/studentData","root","root");
			System.out.println("Connection Successfully.....");
			
			String sql="insert into Student values(17,'Nilam','Salunkhe','Maharashtra','Satara',50)";
			stmt=con.createStatement();
			int count =stmt.executeUpdate(sql);
			System.out.println("No of record inserted :"+count);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			stmt.close();
			con.close();
		}
	}

}



package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//Retriving particular column from DataBase
public class RetriveParticularRecord {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Statement stmt=null;
		Connection con=null;
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentData", "root", "root");
		System.out.println("Connection Successfully...");
		
		String sql="select Firstname,Lastname, marks from Student";
		stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(sql);
		while(rs.next())
		{
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}
			
		}
		catch(Exception e)
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

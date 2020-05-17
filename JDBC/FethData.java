package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
//Retriving all Records From Database
public class FethData {
//Statement Interface
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Statement stmt=null;
			Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentData","root","root");
			System.out.println("Connection Successfully....");
			
			stmt=con.createStatement();
			String sql="select * from Student";
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" | "+rs.getString(2)+" | "+rs.getString(3)+" | "+rs.getString(4)+" | "+rs.getString(5)+" | "+rs.getString(6));
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

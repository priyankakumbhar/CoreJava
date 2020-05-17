package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Student {
//Insert data into database
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/studentData","root","root");
			System.out.println("Connection Successfully.....");
			
			String sql="select * from Student";
			Statement smt=con.createStatement();
			ResultSet rs=smt.executeQuery(sql);
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getInt(6));
			}
			
		   
		    con.close();
		}
		catch(Exception e)
		{
		e.printStackTrace();
		}

	}

}

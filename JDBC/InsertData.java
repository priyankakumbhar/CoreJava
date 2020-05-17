package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertData {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		PreparedStatement ps=null;
		Connection con=null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentData", "root", "root");
			System.out.println("Connection Successfull...");
			
			String sql="insert into Student values(?,?,?,?,?,?)";
			ps=con.prepareStatement(sql);
			ps.setInt(1, 5);
			ps.setString(2,"Satish");
			ps.setString(3, "Raje");
			ps.setString(4, "Beed");
			ps.setString(5,"Karad");
			ps.setInt(6, 85);
			
			int count =ps.executeUpdate();
			System.out.println("Record "+count+" inserted Successfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			ps.close();
			con.close();
		}
	}

}

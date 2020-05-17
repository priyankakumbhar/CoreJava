package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class deleteRecord {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		PreparedStatement ps=null;
		Connection con=null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentData","root","root");
			
			String sql="Delete from Student Where Studentid=?";
			ps=con.prepareStatement(sql);
			ps.setInt(1, 3);
			int count=ps.executeUpdate();
			System.out.println("Recored "+count+ "deleted successfully");
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

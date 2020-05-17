package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//Update Record Using Prepared Statement
public class recordUpdate {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		PreparedStatement ps= null;
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentData","root","root");
			System.out.println("Connection SuccessFull..");
			
			String sql="update Student set marks=? where studentid=?";
			ps=con.prepareStatement(sql);
			ps.setInt(1, 45);
			ps.setInt(2, 3);
			
			int count=ps.executeUpdate();
			System.out.println("Record updated Successfully.."+count);
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

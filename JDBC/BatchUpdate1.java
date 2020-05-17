package JDBC;
import java.sql.BatchUpdateException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//BatchUpdate using Prepared Statement
public class BatchUpdate1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		PreparedStatement ps=null,ps1=null,ps2=null,ps3=null;
		Connection con=null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/studentData","root","root");
			System.out.println("Connection Successfully.....");
			String sql="insert into Student value(?,?,?,?,?,?)";
			String sql1="delete from Student where studentid=?";
			String sql2="update student set marks=? where studentid=?";
			
			ps=con.prepareStatement(sql);
			ps1=con.prepareStatement(sql1);
			ps2=con.prepareStatement(sql2);
			
			ps.setInt(1, 12);
			ps.setString(2, "Poonam");
			ps.setString(3, "Nikam");
			ps.setString(4, "Pune");
			ps.setString(5, "Khadki");
			ps.setInt(6,66);
			ps.addBatch();
			int count[]=ps.executeBatch();
			System.out.println("Record added :"+count.length);
			
			ps1.setInt(1,14 );
			ps1.addBatch();
			int count1[]=ps1.executeBatch();
			System.out.println("Record Deleted "+count1.length);
			
			ps2.setInt(1, 55);
			ps2.setInt(2, 5);
			ps2.addBatch();
			int count2[]=ps2.executeBatch();
			System.out.println("Record updated successfully :"+count2.length);
			
		}
		catch(BatchUpdateException e)
		{
			e.printStackTrace();
			int a[]=e.getUpdateCounts();
			System.out.println("No of batch Terminated :"+a.length);
		}
		finally
		{
			ps.close();
			ps1.close();
			ps2.close();
			con.close();
		}
	}

}

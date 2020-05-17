package JDBC;
import java.sql.BatchUpdateException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

//batch Update using statement object
public class batchUpdate {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Statement stmt=null;
		Connection con=null;
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentData", "root", "root");
			System.out.println("Connection Successfull...");
			stmt=con.createStatement();
			stmt.addBatch("delete from Student where Studentid=13");
			stmt.addBatch("delete from Student where Studentid=12");
			int count[]=stmt.executeBatch();
			System.out.println(" Batches Deleted Successfully : "+count.length);
		}
		catch(BatchUpdateException e)
		{
			e.printStackTrace();
			int [] a=e.getUpdateCounts();
			System.out.println(a);
		}
		finally
		{
			stmt.close();
			con.close();
		}
	}

}

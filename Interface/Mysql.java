package Interface;

public class Mysql implements Database{
	public void connect()
	{
		System.out.println("Successfully Connected to Mysql database");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Database d=new Oracle();
		Database d1=new Mysql();
		d.connect();
		d1.connect();

	}

}

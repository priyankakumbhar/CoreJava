package Stream;

import java.io.File;
import java.io.IOException;

public class Createfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		File f=new File("E:\\First.txt");
		boolean is=f.createNewFile();
		if(is)
		{
			System.out.println("file is created sucssfully");
        }
		else
		{
			System.out.println("file already exist");
		}
		}
		catch(IOException io)
		{
		io.printStackTrace();
		}
		

	}

}

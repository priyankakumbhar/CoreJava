package Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Persist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Student s1=new Student(1,"Priyanka",25);
			FileOutputStream fis=new FileOutputStream("E://First.txt");
			ObjectOutputStream o=new ObjectOutputStream(fis);
			o.writeObject(s1);
			o.flush();
			o.close();
			System.out.println("Success");
			
			
		}
		catch(IOException io)
		{
		io.printStackTrace();
		}
	}

}

package Stream;

import java.io.ByteArrayInputStream;
import java.io.IOException;

@SuppressWarnings("unused")
public class ByteArrayInputStream1 {

	public static void main(String[] args) {
		byte data[]="Dreamtech Press".getBytes();
		ByteArrayInputStream in=new ByteArrayInputStream(data);
		int character;
		while((character = in.read()) != -1)
				{
			     System.out.println((char)character);
				}
		
	}

}

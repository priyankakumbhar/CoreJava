package Stream;

import java.io.ByteArrayInputStream;

public class resetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String p="Dreamtech";
		byte B[]=p.getBytes();
		ByteArrayInputStream in=new ByteArrayInputStream(B);
		for(int j=0;j<2;j++)
		{
			int N;
			while((N=in.read()) !=- 1)
			{
				if(j==0) {
					System.out.println((char)N);
				}
				else
				{
					System.out.print(Character.toUpperCase((char)N));
				}
			}
			System.out.println();
			in.reset();
		}
		
	}

}

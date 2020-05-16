package Thread;

public class Assignment3 {
//Pause Thread By using sleep method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		System.out.println("welcome");
		Thread.sleep(1000);
		System.out.println("to");
		Thread.sleep(1000);
		System.out.println("learn");
		Thread.sleep(1000);
		System.out.println("java");
		
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
	}

}

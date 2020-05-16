package Thread;

public class Assignment2 {
//Naming Thread
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Thread t=Thread.currentThread();
			System.out.println("Original Thread: "+t.getName());
			t.setName("NewThread");
			System.out.println("NewThread: "+t.getName());
	}

}

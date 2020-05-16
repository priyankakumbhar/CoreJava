package Polymorphism;

public class staticPoly {
	public void add(int a,int b)
	{
		System.out.println("Addition:"+(a+b));
	}
    public void add(int x,int y,int z)
    {
    	System.out.println("Addition: "+(x+y+z));
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticPoly s=new staticPoly();
		s.add(2, 3);
		s.add(3, 6, 9);
       
	}

}

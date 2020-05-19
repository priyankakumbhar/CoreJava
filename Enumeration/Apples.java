package Enumeration;

public class Apples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mangos m;
		System.out.println("kesar cost "+Mangos.Kesar.getPrice()+" "+"cent");
		System.out.println();
		for(Mangos a:Mangos.values())
		{
		System.out.println(a);
		}
	}

}

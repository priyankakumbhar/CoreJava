package Enumeration;

public class EnumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wheat al=Wheat.Emmer;
		System.out.println("value of al :"+al);
		System.out.println();
		al=Wheat.Emmer;
		if(al==Wheat.Spelt)
		{
			System.out.println("al contains spelt \n");
		}
		switch(al)
		{
		case Emmer:
					System.out.println("First");
					break;
		case Durum:
					System.out.println("Second");
					break;
		case CommonWheat:
					System.out.println("Third");
					break;
		case Spelt:
					System.out.println("Fourth");
					break;
		}

	}

}

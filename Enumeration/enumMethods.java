package Enumeration;
//values and valueOf method
public class enumMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Wheat al;
			System.out.println("Here are all wheat constant:");
			Wheat allWheat[]=Wheat.values();
			for(Wheat w:allWheat)
			{
				System.out.println(w);
				System.out.println();
			}
			al=Wheat.valueOf("Emmer");
			System.out.println("al contain value: "+al);
		}

}

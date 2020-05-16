package Enumeration;

public class Apple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mango m1,m2,m3;
		System.out.println("Here are all mango constant" + "and there ordinal values :");
		for(Mango a:Mango.values())
		{
			System.out.println(a+ " "+ a.ordinal());
		}
				
        m1=Mango.Alphanso;
        m2=Mango.Brooks;
        m3=Mango.Alphanso;
        System.out.println();
        //CompareTo method
        if(m1.compareTo(m2)<0)
        {
        	System.out.println(m1+" comes before "+m2);
        }
        if(m1.compareTo(m2)>0) {
        
        	System.out.println(m2+" comes before "+m1);
        }
        if(m1.compareTo(m2)==0)
        {
        	System.out.println(m1+" and "+m2+ " are equal");
        }
        
        //equal method
        if(m1.equals(m2))
        {
        	System.out.println("Error");
        }
        if(m2.equals(m3))
        {
        	System.out.println("Error");
        }
        if(m1.equals(m3))
        {
        	System.out.println(m1+" == "+m3);
        }
	}
	

}

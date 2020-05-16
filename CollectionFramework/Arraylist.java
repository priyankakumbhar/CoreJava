package CollectionFramework;
import java.util.*;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		System.out.println(list);
		Iterator e=list.iterator();
		//Iterator 
		while(e.hasNext())
		{
			String s=(String)e.next();
			System.out.println(s);
		}
		
		
		
		
	}
}


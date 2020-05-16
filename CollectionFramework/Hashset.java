package CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.add(5);
		System.out.println(hs);
		Iterator<Integer> i=hs.iterator();
		while(i.hasNext())
		{
			int k=i.next();
			System.out.println(k);
		}
		
		
	}

}

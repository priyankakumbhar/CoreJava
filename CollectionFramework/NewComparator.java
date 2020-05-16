package CollectionFramework;

import java.util.Comparator;

public class NewComparator implements Comparator {
	public int compare(Object obj1,Object obj2)
	{
		if(((String) obj1).equals("Item3"))
				{
			   return -1;
				}
		return ((String) obj1).compareTo((String) obj2) ;
	}

}

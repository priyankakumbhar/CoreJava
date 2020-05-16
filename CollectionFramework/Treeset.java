package CollectionFramework;
import java.util.*;

public class Treeset  {
@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts=new TreeSet<String>(new NewComparator());
		ts.add("Item1");
		ts.add("Item2");
		ts.add("Item3");
		ts.add("Item4");
		ts.add("Item5");
		ts.add("Item6");
		System.out.println(ts);
		Iterator<String> itr=ts.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}

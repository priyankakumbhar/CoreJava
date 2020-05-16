package CollectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("Item1", "Value1");
		hm.put("Item2", "Value2");
		hm.put("Item3", "Value3");
		hm.put("Item4", "Value4");
		hm.put("Item5", "Value5");
		hm.put("Item6", "Value6");
		
		Set set=hm.entrySet();
		Iterator i=set.iterator();
		while(i.hasNext())
		{
			Map.Entry me=(Map.Entry)i.next();
			System.out.println(me.getKey()+"_"+me.getValue());
		}

	}

}

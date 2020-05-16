package CollectionFramework;

import java.util.Map;
import java.util.Properties;
import java.util.Set;
//System Properties
public class SetEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties pos=System.getProperties();
		Set<Map.Entry<Object,Object>> entryset=pos.entrySet();
		for(Map.Entry entry:entryset)
		{
			System.out.println(entry.getKey()+ ":" +entry.getValue() );
		}

	}

}

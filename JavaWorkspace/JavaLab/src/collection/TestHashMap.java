package collection;

import java.security.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestHashMap {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("John",2000);
		map.put("David",3000);
		map.put("Tom",5000);
		//Set<String> keySet = map.keySet();
		//Iterator<String> iterator =keySet.iterator();
		//while (iterator.hasNext()) {
		//	String key =iterator.next();
		//	Integer value = map.get(key);
		//	System.out.println("Tom 薪水="+value);
		//}
		
		
		
		Set keys =map.keySet();
		int sum =0;
		/*Iterator iterator = keys.iterator();
		while (iterator.hasNext()) {
			Object key = iterator.next();
			Object value = map.get(key);
			Integer s =(Integer)value;
			sum=sum+s;
			System.out.println(key+"薪水="+value);
			
		}
        */
	    Set entrySet = map.entrySet();
	    for (Object e : entrySet) {
			Map.Entry entry = (Map.Entry)e;
			System.out.println(entry.getKey()+"薪水="+entry.getValue());

	}
	    System.out.println(map.size());
	
	}
	

}

package collectiondiscussion;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapDiscussion {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(101, "Delhi");
		hm.put(506, "Pune");
		hm.put(404, "Mumbai");
		hm.put(900, "Bengaluru");
		
		hm.put(404, "Srinagar");
		hm.put(800, "Pune");
		
		System.out.println(hm);
		
		
		
		Collection<String> v = hm.values();
		
		System.out.println(v);
		
String valueof900 = hm.get(900);
System.out.println(valueof900);
		
		boolean ispresent = hm.containsValue("Pune");
		
		System.out.println(ispresent);
		
		boolean iskeypresent = hm.containsKey(404);
		
		System.out.println(iskeypresent);
		
		
		
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
		
		lhm.put(101, "Delhi");
		lhm.put(506, "Pune");
		lhm.put(404, "Mumbai");
		lhm.put(900, "Bengaluru");
		
		System.out.println(lhm);
		
		Set<Entry<Integer, String>> value = lhm.entrySet();
		
		for(Entry<Integer, String> individual :value)
		{
			System.out.println(individual.getKey() +" "+ individual.getValue());
		}
		
		
		
	}

}

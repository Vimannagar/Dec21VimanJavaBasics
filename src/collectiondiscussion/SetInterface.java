package collectiondiscussion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetInterface {
	
	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("Delhi");
		hs.add("Mumbai");
		hs.add("Kolkata");
		hs.add("Chennai");
		hs.add("Pune");
		hs.add("Delhi");
		
		System.out.println(hs);
		
	hs.add(null);
	
	System.out.println(hs);
		
	
	
	String [] s = {"aaa","aaa", "bbb", "ccc"};
	
	HashSet<String> hs1 = new HashSet<String>(Arrays.asList(s));
	
	System.out.println(hs1);
	
	LinkedHashSet<String> lhs = new LinkedHashSet<String>();
	lhs.add("Delhi");
	lhs.add("Mumbai");
	lhs.add("Kolkata");
	lhs.add("Chennai");
	lhs.add("Pune");
	lhs.add("Delhi");
	lhs.add(null);
	
	System.out.println(lhs);
	
	
	}

}

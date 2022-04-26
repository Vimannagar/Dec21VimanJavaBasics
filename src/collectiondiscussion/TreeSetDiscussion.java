package collectiondiscussion;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetDiscussion {
	
	
	public static void main(String[] args) {
		
	TreeSet<String> ts = new TreeSet<String>();
	
	ts.add("Delhi");
	ts.add("Mumbai");
	ts.add("Kolkata");
	ts.add("Chennai");
	ts.add("Pune");
	ts.add("Delhi");

	System.out.println(ts);
	
	
	
	TreeSet<Integer> ts1 = new TreeSet<Integer>();
	ts1.add(10);
	ts1.add(50);
	ts1.add(42);
	ts1.add(8);
	ts1.add(1);
	ts1.add(99);
	
	System.out.println(ts1);
	
	
//	Representing data in descending order:
TreeSet<String> ts2 = new TreeSet<String>(new MyComp());
	
	ts2.add("Delhi");
	ts2.add("Mumbai");
	ts2.add("Kolkata");
	ts2.add("Chennai");
	ts2.add("Pune");
	ts2.add("Delhi");
	
	System.out.println(ts2);
	
	
	
	
	}

}

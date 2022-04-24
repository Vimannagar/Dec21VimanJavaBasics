package collectiondiscussion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class LinkedListImplementation {
	
public static void main(String[] args) {
		
		LinkedList<String> al = new LinkedList<String>();
		
		al.add("abc");
		
		al.add("abc");
		al.add("def");
		al.add("ghi");
		
		System.out.println(al);
		
		al.remove(2);
		
		System.out.println(al);
		
		al.set(0, "ghi");
		System.out.println(al);
		
		
}

}

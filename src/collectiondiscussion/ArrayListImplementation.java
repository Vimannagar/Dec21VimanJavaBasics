package collectiondiscussion;

import java.util.ArrayList;

public class ArrayListImplementation {
	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("abc");
		
		al.add("abc");
		al.add("def");
		al.add("ghi");
		
		System.out.println(al);
		
		al.remove(2);
		
		System.out.println(al);
		
		al.add(1, "velocity");
		
		System.out.println(al);
		
		al.set(0, "hij");
		
		System.out.println(al);
		
		
		ArrayList<String> al2 = new ArrayList<String>();
		
		
		
		al2.add("Pune");
		al2.add("Mumbai");
		al2.add("Delhi");
		al2.add("Bhopal");
		al2.addAll(al);
		
		System.out.println(al2);
		
		
		boolean ispresent = al2.contains("hij");
		
		System.out.println(ispresent);
//		containsAll() - To check whether all the element of arrayList is present in another arraylist or not
		
		boolean isallpresent = al2.containsAll(al);
		System.out.println(isallpresent);
		
		
		al2.removeAll(al);
		
		
		
	boolean ispresntafterremoval = al2.containsAll(al);
	
	System.out.println("After the removal of al contains all returns "+ispresntafterremoval);
		
	
	System.out.println(al2);
		
		
		
		
		
	}

}

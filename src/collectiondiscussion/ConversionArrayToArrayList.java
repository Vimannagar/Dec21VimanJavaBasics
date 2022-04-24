package collectiondiscussion;

import java.util.ArrayList;
import java.util.Arrays;

public class ConversionArrayToArrayList {
	
	
	public static void main(String[] args) {
		
		String [] s = {"aaa", "bbb", "ccc"};
		
		
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(s));
		
		System.out.println(al);
		
//		conversion from Arraylist to array
		
		
		int length = al.size();
		
		String [] ss = new String[length];
		
		
		al.toArray(ss);
		
		for(String sss:ss)
		{
			System.out.println(sss);
		}
		
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		
		
		al2.add(50);
		al2.add(60);
		al2.add(70);
		
		
		int length2 = al2.size();
		
		
		Integer [] i = new Integer[length2];
		
		al2.toArray(i);
		
		for(int h:i)
		{
			System.out.println(h);
		}
		
		
	}

}

package stringclass;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		
		String s = "abcdefabcdef";
		
	char[] chararray = s.toCharArray();
	
	Character [] a = new Character[s.length()];
	int i =0;
	for(char cc:chararray)
	{
		a[i]=cc;
		i++;
	}
	
	
	
	HashSet<Character> hs = new HashSet<Character>(Arrays.asList(a));
	
	
	System.out.println(hs);
	
	
	
	
		
	
	
	}

}

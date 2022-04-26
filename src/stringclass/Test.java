package stringclass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
	
	
	public static void main(String[] args) {
String s = "abcabcdhsahdjsahdjherbabcjhfjabc";
		
		Pattern pat = Pattern.compile("abc");
		int count = 0;
		Matcher mat = pat.matcher(s);
		
		
		boolean ismatch = mat.find();
		
		while(ismatch)
		{
			count++;
			
		}
		
		System.out.println(count);
		
	}

}

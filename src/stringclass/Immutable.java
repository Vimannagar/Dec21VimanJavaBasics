package stringclass;

public class Immutable {
	
	public static void main(String[] args) {
		
		String s = "abc";
		
		s.concat("def");
		
		System.out.println(s);// abc// this means String is immutable.
		
		s = s+"def";
		
		System.out.println(s);//abcdef
		
		StringBuffer sb = new StringBuffer("abc");
		
		sb.append("def");
		
		System.out.println(sb);//abcdef// this means String buffer is mutable.
		
		
	}

}

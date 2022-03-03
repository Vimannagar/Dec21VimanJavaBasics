package stringclass;

public class BasicConcept {
	
	
	
	
	public static void main(String[] args) {
		
		String ss = new String("abc");
		
		String sss = new String("abc");
		String s1 = new String("def");
		String s2 = new String("def");
		
		
		
		
		String s3 = "ghi";
		
		String s4 = "ghi";
		
		String s5 = "abc";
		
		System.out.println(ss);
		
		System.out.println(s3);
		
		
		
		//equals method:
		
		boolean isequal = ss.equals(s5);
		
		System.out.println(isequal);
		
//		==
		boolean ispointingsame = ss==s5;
		
		System.out.println(ispointingsame);
		
		boolean ispointingsame1 = s3==s4;
		
		System.out.println(ispointingsame1);
		
		
		
	}

}

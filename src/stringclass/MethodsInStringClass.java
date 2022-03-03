package stringclass;

public class MethodsInStringClass {
	
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abcdef";
		
		// 1. equals:
		
		boolean isequal = s1.equals(s2);
		
		System.out.println(isequal);//false
		
		System.out.println("*****************************************");
		
		//2. equalsIgnoreCase()
		String s3 = "abc";
		String s4 = "ABC";
		
		boolean isconequal = s3.equalsIgnoreCase(s4);
		
		System.out.println(isconequal);// true
		
		System.out.println("*******************************************");
		
		//3. charAt(int indexvalue)
		
		String s5= "Velocity";
		
//		char value = s5.charAt(20);// exception - StringIndexOutOfBoundException
		char value = s5.charAt(2);
		System.out.println(value);//l
		
		
		System.out.println("********************************************");
		
//		4. concat(String s)
		
	s5	= s5.concat(" corporate");
	
	System.out.println(s5);// Velocity corporate
		
	System.out.println("***************************************************");
	
//	5. contains(String s)
	
	String s6 = "efdCba";
	
	boolean ispresent = s6.contains("cba");
	System.out.println(ispresent);//false
	
	
	}

}

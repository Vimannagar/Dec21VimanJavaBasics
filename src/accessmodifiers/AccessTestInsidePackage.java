package accessmodifiers;

public class AccessTestInsidePackage {
	
	
	public static void main(String[] args) {
		Test t = new Test();
		
		DefaultClass t1 = new DefaultClass();
		
		Test.m1();
		
//	accessing default method
		
		t.m2();
		
//	accessing private method	
//		Test.m3();- This cannot be accessible here as it is private which can be access only within the class
		
		
		
		
		
	}

}

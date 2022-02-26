package variablesinjava;


import accessmodifiers.Test;
import interfacediscussion.Interface2;


public class AccessTest {
	
	
	public static void main(String[] args) {
		
		
		Test t = new Test();
		
//		calling of public method
		
		Test.m1();
		
//		calling of default method
		
//		t.m2(); - Cannot access the m2 method as it is default which can be accessible only within the package
		
		
		
//	calling of private method
		
//	Test.m3();	Cannot access the m3 method as it is private which can be accessible only within the class
		
System.out.println(Interface2.i);
		
		
		
	}

}

package accessmodifiers;

import accessmodifiersprotected.A;

public class C extends A {
	
	public static void main(String[] args) {
		
		
		A a = new A();
		
//		a.m1();here we cannot access it as it is not a child class variable which is c in this case.
		
		
		C c = new C();
		
		
		c.m1();
		c.m2();
		c.m3();
		A.m4();
		
	}
	
	
}

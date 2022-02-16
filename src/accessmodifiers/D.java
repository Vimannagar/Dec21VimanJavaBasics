package accessmodifiers;

import accessmodifiersprotected.A;

public class D extends C {
	
	public static void main(String[] args) {
		
		C c = new C();
		
//		c.m1();
//		
//		c.m2();
//		
//		c.m3();
		
		D d = new D();
		
		d.m1();
		d.m2();
		d.m3();
		
		A.m4();
	}

}

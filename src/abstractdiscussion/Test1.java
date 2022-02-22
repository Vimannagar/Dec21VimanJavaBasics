package abstractdiscussion;

public class Test1 extends Test
{


	public void m3() {
		
		System.out.println("m3 implementation from Test1 class");
	}
	
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		
		t1.m1();
		t1.m2();
		t1.m3();
		
	}


}

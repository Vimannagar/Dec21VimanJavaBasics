package methodsdiscussion;

public class CallMethodIntoNonStatic {
	
	
	public static void m1()
	{
		System.out.println("m1 static method ");
	}

	
	
	public void m2()
	{
//		calling of static from same class
		m1();
		
//		calling of static from different class
		
		CallMethodIntoNonStatic2.m3();
		
	}
}

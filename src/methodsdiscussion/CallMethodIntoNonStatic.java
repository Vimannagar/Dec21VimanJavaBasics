package methodsdiscussion;

public class CallMethodIntoNonStatic {
	
	
	public static void m1()
	{
		System.out.println("m1 static method ");
	}
	
	
	public void m5()
	{
		System.out.println("m5 non static method ");
	}
	
	
	public void m6()
	{
		// calling of non static in the same class
		m5();
//		calling of non static from different class
		CallMethodIntoNonStatic2 v = new CallMethodIntoNonStatic2();
		v.m7();
		
	}

	
	
	public void m2()
	{
//		calling of static from same class
		m1();
		
//		calling of static from different class
		
		CallMethodIntoNonStatic2.m3();
		
	}
}

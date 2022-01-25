package methodsdiscussion;

public class CallingOfMethodInsideStatic {
	
	
	public static void m1()
	{
		System.out.println("m1 static method");
//	calling of static method inside another static method
		m2();
		CallingOfMethodInsideStatic2.m3();
		
	}
	
	
	public void m4()
	{
		System.out.println("m4 non static method");
	}
	
	public static void m5()
	{
//		calling of non static method inside the static method
		
		CallingOfMethodInsideStatic a = new CallingOfMethodInsideStatic();
		
		a.m4();// same class
		
		CallingOfMethodInsideStatic2 b = new CallingOfMethodInsideStatic2();
		
		b.m6();// different class
	}
	
	
	
	public static void m2()
	{
		System.out.println("m2 static method");
	}
	
	public static void main(String[] args) {
		m1();
		m5();
		
		
		
	}

}

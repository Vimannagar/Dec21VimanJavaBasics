package accessmodifiersprotected;

public class A {
	
	
	protected void m1()
	{
		System.out.println("protected method from m1  from A class");
	}
	
	protected void m2()
	{
		System.out.println("protected method from m2 from A class");
	}
	
	protected void m3()
	{
		System.out.println("protected method from m3 from A class");
	}
	
	protected static void m4()
	{
		System.out.println("protected static method m4 from A class");
	}
	
	
	public static void main(String[] args) {
		
		A a = new A();
		
		a.m1();
		a.m2();
		a.m3();
		
		m4();
		
	}
	
}

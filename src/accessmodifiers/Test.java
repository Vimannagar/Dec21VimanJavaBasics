package accessmodifiers;

public class Test {
	
	
//	method level access modifier
	
//	public method
	public static void m1()
	{
		System.out.println("public method");
	}
	
//	default method
	void m2()
	{
		System.out.println("default method");
	}
	
	
//	private method
	
	private static void m3()
	{
		System.out.println("m3 method");
	}

	
	public static void main(String[] args) {
		m3();
	}
}

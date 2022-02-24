package abstractdiscussion;

public abstract class AbstractWithStaticMethod {
	
	public static void m1()
	{
		System.out.println("m1 static method");
	}
	
//	public abstract static void m2();static method cannot be declared as abstract
	
	
	public static void main(String[] args) {
		m1();
		
	}

}

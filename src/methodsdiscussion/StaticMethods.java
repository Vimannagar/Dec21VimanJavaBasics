package methodsdiscussion;

public class StaticMethods {
	
	public static void printHelloLogic()
	{
		
		System.out.println("Hello world");
		System.out.println("Hello world");
		System.out.println("Hello world");
		System.out.println("Hello world");
		System.out.println("Hello world");
		
		
	}
	
	public static void addition()
	{
		int a = 10;
		
		int b = 20;
		
		int c = a+b;
		
		System.out.println("c value is "+c);
		
	}
	
	
	public static void main(String[] args) {
		
		printHelloLogic();	
		addition();
		printHelloLogic();
		
		StaticMethod2.m1();
		
		StaticMethods.addition();
		
	
	}

}

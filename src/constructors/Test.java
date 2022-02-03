package constructors;

public class Test {
	
	
//	syntax of constructor: acessmodifier nameofclass()
//							{
//		
//							}
	
	public Test()
	{
		System.out.println("zero argument Constructor is executing");
	}
	
	public Test(int i)
	{
		System.out.println(i);
		System.out.println("One argument constructor");
	}
	
	
	public Test(String s , double d)
	{
		System.out.println("2 argument constructor");
		
		System.out.println(s + " " + d);
	}
	

	
	public static void main(String[] args) {
		Test t = new Test();
		
		
		Test1 t1 = new Test1();
		
		Test t2 = new Test(50);
		
		
		Test t3 = new Test("Height", 6.5);
		
		
		
		
	}
}
 
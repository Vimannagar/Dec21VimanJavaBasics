package constructors;

public class Test2 {
	
	public Test2()
	{
		
		System.out.println("zero argument constructor");
	}
	
	public Test2(String s)
	{	
		this();
		System.out.println(s);
		System.out.println("One argument constructor");
	
	}
	
	public Test2(boolean b, int c)
	{	this("Velocity");
		System.out.println("Two argument constructor");
	}
		
	
	public static void main(String[] args) {
		
		Test2 t3 = new Test2(true, 50);
		

	}
	
	

}

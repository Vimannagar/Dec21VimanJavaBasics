package polymorphism;

public class Overloading2 {
	
	public void m1()
	{
		System.out.println("zero argument method");
	}
	
	
public void m1(int i)
	{
		System.out.println("one argument method");
	}
	
	public void m1(int i, String s)
	{
		System.out.println("two argument method");
	}
	
	public static void main(String[] args) {
		
		
		Overloading2 o2 = new Overloading2();
		
		o2.m1();
		o2.m1(56);
		o2.m1(80, "abc");
		
		Overloading2 o3 = new Overloading2();
	}

}

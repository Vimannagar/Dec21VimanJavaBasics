package polymorphism;

public class Overloading {
	
	public static void m1()
	{
		System.out.println("m1 method with no argument");
		
	}
	
	private static void m1(int i , int j)
	{
		System.out.println("m1 method with no argument");
		
	}
	
	private static void m1(int i , int j, int k)
	{
		System.out.println("m1 method with no argument");
		
	}
	
	public static void m1(int i)
	{
		System.out.println("m1 second static method");
	}
	
	public void m1(boolean b)
	{
		System.out.println("m1 method with boolean argument");
		
	}
	
	public void m1(int i, boolean b )
	{
		System.out.println("m1 method with int and then boolean");
	}
	
	public void m1(boolean b, int i )
	{
		System.out.println("m1 method with int and then boolean");
	}
	
	
	public int m1(char c)
	{
		System.out.println("method m1 with return type");
		
		return 50;
	}
	
	
	
	public static void nameChange(int adharno, String updatedname, String marksheet)
	{
		System.out.println("name changed");
	}
	
	public static void nameChange(int adharno, String updatedname, String marksheet, String marriagecert)
	{
		System.out.println("name changed after marriage");
	}
	
	
	public static void main(String[] args) {
		
		
		m1();
		
		m1(50);
		
		m1(50, 60);
		
		
		
		
		
	}

	
	
	
	
	
}

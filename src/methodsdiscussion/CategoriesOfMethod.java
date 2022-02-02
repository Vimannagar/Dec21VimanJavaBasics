package methodsdiscussion;

public class CategoriesOfMethod {
	
	
//	a. method without return type and without argument
	
	public void m1()
	{
		System.out.println("no return no arg");
	}
	
	public static void m2()
	{
		System.out.println("no return and no arg");
	}
	
//	b. method without return type and with argument
	
	public void m3(int i, String j, boolean k)
	{
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
	}
	
	public static void m4(String value)
	{
		System.out.println(value+" city");
		
		
	}
	
	public static void main(String[] args) {
		
		CategoriesOfMethod com = new CategoriesOfMethod();
//		c. Method without return type and with argument
		com.m3(60, "Velocity", true);
		
		m4("Pune");
//	c. Method with return type and without argument	
	boolean returnvalue	= com.m5();
	
	System.out.println(returnvalue);// true
	
	String retvalue = m6();
	
	System.out.println(retvalue+" corporate");
	
	int value	= add(10, 20);
int l = value+2;

System.out.println(l);
		
		
	}
	
//	c. Method with return type and without argument
	
	public boolean m5()
	{
		System.out.println("method with return type");
		
		return false;
		
	}
	
	public static String m6()
	{
		String s = "Velocity";
		System.out.println("m6 is executing");
		
		System.out.println("static method with String return type");
		
		return s;
	}
	
	
// method with return type and with argument
	
	public static int add(int i, int j)
	{
		int sum = i+j;
				
		return sum;
	}
	
	
	

}

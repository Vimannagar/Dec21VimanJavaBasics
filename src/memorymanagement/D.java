package memorymanagement;

public class D extends E {

	
	public void m10()
	{
		a.m1();
		
		b.m5();
	}
	
	public void m11()
	{
		a.m3();
		b.m6();
		c.m9();
	}
	
	public static void main(String[] args) {
		
		D d = new D();
		
		d.m11();
		
		d.m10();
		
		
	}
	
	
}

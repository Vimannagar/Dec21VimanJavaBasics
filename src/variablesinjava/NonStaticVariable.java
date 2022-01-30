package variablesinjava;

public class NonStaticVariable {

	
	String a = "abc";
	
	int g = 50;
	
	
	
	
	public static void main(String[] args) {
		
		NonStaticVariable nsv = new NonStaticVariable();
		
		System.out.println(nsv.a);
		
		System.out.println(nsv.g);
		
	int h	=  nsv.g +6;
	
	System.out.println(h);
	
	NonStaticVariable2 nsv2 = new NonStaticVariable2();
	System.out.println(nsv2.f);
		
		
	}
	
	public void m1()
	{
		System.out.println(g);
		
	}
	
	
}

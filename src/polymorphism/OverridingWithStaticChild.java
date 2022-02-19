package polymorphism;

public class OverridingWithStaticChild extends OverridingWithStaticParent{
		
	public static void m1()
	{
		System.out.println("m1 static method from Child class");
	}
	
	
	public static void m2()
	{
		System.out.println("m2 static method from Child class");
	}
	
	public static void main(String[] args) {
		OverridingWithStaticChild c = new OverridingWithStaticChild();
		c.m1();// child class method
		
		OverridingWithStaticParent p = new OverridingWithStaticParent();
		p.m1();// parent class method
		
		OverridingWithStaticParent pp = new OverridingWithStaticChild();
		
		pp.m1();
		
		m1();
		
		
	}

}

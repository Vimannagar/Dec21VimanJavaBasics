package polymorphism;

public class Child extends Parent {
	
	
	public int m1()
	{
		System.out.println("m1 method from child class");
		return 50;
	}
	
	
	public void marry()
	{
		System.out.println("Child marry method");
	}
	
	public void m5()
	{
		System.out.println("m5 with no arg");
	}
	
	public void m5(int i)
	{
		System.out.println("m5 with one arg");
	}
	
	
	
	
	public static void main(String[] args) {
		Child c = new Child ();
		c.home();
		
		c.car();
		
		c.m2();
		
		c.marry();// child class marry method
		
		Parent p = new Parent();
		
		p.marry();// parent class marry method
		
		c.m1();//child class m1 method
		p.m1();//parent class m1 method
		
		
		c.m5();
		
//		syntax to create object in another way
		
//		Parentclass referencevariable = new Childclass();
		
		Parent pp = new Child();
		
		pp.m1();// child class m1 method
		
//		pp.m5();
		
		pp.car();// car method from parent class
		
		
	}

}

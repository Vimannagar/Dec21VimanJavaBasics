package casting;

public class Child extends Parent {
	
	public void m1()
	{
		System.out.println("Child class m1 method");
	}
	
	public void m3()
	{
		System.out.println("Child class m3 method");
	}
	
	public static void main(String[] args) {
		
		
		Child c = new Child();
		
		Parent  pp = (Parent)c;// UP casting
		

		
		c.m3();// child class
		
		pp.m1();// child class
		
		pp.m2();// Parent class
		
		
		Child cc = (Child)pp;// Down casting
		
		cc.m2();// parent class
		
		cc.m3();// child class
		
		Parent p = new Parent();
		
		Child ccc  = (Child)p;
		
		
		ccc.m1();
	}

}

package accessmodifiers;

public class Child extends Parent{
	
	public void bike()
	{
		System.out.println("bike method from child class");
	}
	
//	public void marry()
//	{
//		System.out.println("child class marry method");
//	}
	
	public static void main(String[] args) {
		
		
		Child c = new Child();
		c.home();
		c.property();
		c.furniture();
		
		
	}

}

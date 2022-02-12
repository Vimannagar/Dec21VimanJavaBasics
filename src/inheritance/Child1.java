package inheritance;

public class Child1 extends Parent {
	String s = "def";
	public void bike()
	{
		System.out.println("bike method from child1 class");
		System.out.println(s);//def
		System.out.println(this.s);//def
		
		System.out.println(super.s);//abc
		
		
	}
	
	public static void main(String[] args) {
		
		Child1 c =  new Child1();
		
		c.bike();
		
		c.home();
		
		c.car();
		
		c.property();
		
		Parent.furniture();
		
		c.farm();
		
		System.out.println(landarea);
		
		
		
	}

}

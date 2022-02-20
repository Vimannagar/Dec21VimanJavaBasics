package accessmodifiers;

public  class Parent {
	
	
	static final int i = 20; 
	public void home()
	{
		System.out.println("Home method from parent");
	}
	
	public void car()
	{
		System.out.println("car method from parent");
		System.out.println(this.i);
	
//		i=21;
		
	}
	
	
	public void property()
	{
		System.out.println("property method from parent");
	}
	
	public static void furniture()
	{
		System.out.println("furniture from parent class");
	}
	
	
	public final void marry()
	{
		System.out.println("marry method from parent");
	}

	

}

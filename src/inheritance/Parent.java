package inheritance;

public class Parent extends GrandFather{
	
	static int  homearea = 1250;
	
	String s = "abc";
	
	public void home()
	{
		System.out.println("Home method from parent");
	}
	
	public void car()
	{
		System.out.println("car method from parent");
	}
	
	
	public void property()
	{
		System.out.println("property method from parent");
	}
	
	public static void furniture()
	{
		System.out.println("furniture from parent class");
	}
	
	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.car();
		
		p.farm();
		
		
	}
	
	

}

package interfacediscussion;

public interface Interface1 {
	
	public void close();
	
	public void open();
	
	public void click(); //or public abstract void click(); or void click();
		
	void getId();
	
	
	
//	All the methods inside an interface are by default public and abstract whether we define it or not
	
	
	public static void m1()
	{
		System.out.println("static method of interface1");
		
	}
	
	
public static void main(String[] args) {
	Interface1 i1;
	
	m1();
	Interface1.m1();
	
	
}
		
	

}

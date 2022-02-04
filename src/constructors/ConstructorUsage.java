package constructors;

public class ConstructorUsage {
	
	int i;
	String s;
	boolean b;
	
	
	public ConstructorUsage(int i , String s, boolean b)
	{
		this.i= i;
		this.s= s;
		this.b= b;
		
	}
	
	public static void main(String[] args) {
		
		ConstructorUsage cu = new ConstructorUsage(50, "abc", true);
		
		ConstructorUsage cu1 = new ConstructorUsage(60, "def", false);
		
		
		
		
		
		
	}

}

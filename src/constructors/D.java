package constructors;

public class D extends C{
	
	public D()
	{
		super(50);
		System.out.println("Zero arg D class cons");
	}
	
	public static void main(String[] args) {
		D d = new D();
	}

}

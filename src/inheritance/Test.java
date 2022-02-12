package inheritance;

public class Test extends ParentTest {
	
	public Test(int i)
	{
		super("Abc");
		System.out.println("Test class one arg cons");
	}
	
	public static void main(String[] args) {
		Test t =  new Test(50);
		
	}

}

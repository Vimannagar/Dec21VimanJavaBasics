package exceptionhandling;

public class Test3 {
	
	Test2 t;
	public static void main(String[] args) {
		
		Test3 t3 = new Test3();
		
		t3.mathCalc();
		
	}
	
	
	
	public  void mathCalc()
	{
		try {
			
			System.out.println(t.i);
			
						
		}
		
		catch(NullPointerException np)
		{
			System.out.println("Null pointer exception arrived");
		}
		catch(ArithmeticException np)
		{
			System.out.println("Arithmatic");
			
		}
	}

}

package exceptionhandling;

public class TryCatchFinally {
	
	public void m()
	{
		System.out.println("m method is executing");
	}
	
	public static void main(String[] args) {
		
		try {
		
		TryCatchFinally t = null;
		
		t.m();
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception arrived");
		}
		
		catch(NullPointerException npe)
		{
			System.out.println("Nullpointer exception arrived");
			TryCatchFinally t = new TryCatchFinally();
			t.m();
		}
		
		finally
		{
			System.out.println("finally is executing");
		}
		
		
		
	}

}

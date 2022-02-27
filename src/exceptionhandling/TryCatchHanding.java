package exceptionhandling;

import java.io.FileNotFoundException;

public class TryCatchHanding {
	
	public static void main(String[] args) {
		int i = 10;
		
		int j = 0;
		int k = 0;
		try
		{
		
		k = i/j;// risky code 
		
		}
		catch(StringIndexOutOfBoundsException s)
		{
			System.out.println("String index out of bound exception");
			
		}
		
		catch(NullPointerException n)
		{
			System.out.println("null pointer exception");
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("catch block of arithmetic exception is executing");
			k= 5;
		}
		
		System.out.println("The value of k is " + k);
	}

}

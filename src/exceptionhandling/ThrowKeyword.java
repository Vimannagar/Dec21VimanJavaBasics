package exceptionhandling;

import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;

public class ThrowKeyword {
	
	public static void main(String[] args)  {
		int i =50;
		int j=60;
		System.out.println("first line before the exception");
		if(i>j)
		{
		throw new ArithmeticException();
		}
		
		else if(j>i)
		{
			throw new NullPointerException("Please try after sometime");
			
		}
		
		
		System.out.println("last line after the exception");
	}
	
	

}

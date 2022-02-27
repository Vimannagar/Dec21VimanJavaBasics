package exceptionhandling;

public class TypesOfException {
	
	
	public static void main(String[] args) {
		try
		{
		 int i = 0;
		 int j = 10;
		 
		 int k = j/i;
		 
		}
		
	
		catch (NullPointerException npe)
		{
			System.out.println("null pointer exception arrived");
		}
		
		
		catch (StringIndexOutOfBoundsException s)
		{
			System.out.println("String index exception arrived");
		}
		catch(Exception e)
		{
			System.out.println("Exception handled");
			
			System.out.println(e.getMessage());
			
			
			
		}
		
		
	}
	
	

}

package variablesinjava;

public class IfElsediscussion {
	
	public static void main(String[] args) {
		int i = 5;
		int j = 10;
		
		if(i<j)
		{
			String s  = "Velocity";
			System.out.println("condition true");
			System.out.println(i);// since i scope is throughout the main method hence we can access it here.
			
		}
		
		else
		{
			
			System.out.println("condition false");
		}
		
//		System.out.println(s);// Error- because s is defined within the if body hence it will not be accessible here.
		
		
	}

}

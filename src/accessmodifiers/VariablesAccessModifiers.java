package accessmodifiers;

public class VariablesAccessModifiers {
//	public variable
	public static int i = 20;
//	default variable	
	
	static String s = "abc";
	
//	private varible
	
	private static boolean b= false;
	
//	protected variable
	
	protected int j = 50;
	
	
	public static void main(String[] args) {
		System.out.println(i);
		
		System.out.println(s);
		
		System.out.println(b);
		
		
		VariablesAccessModifiers vam = new VariablesAccessModifiers();
		
		System.out.println(vam.j);
		
	}

}

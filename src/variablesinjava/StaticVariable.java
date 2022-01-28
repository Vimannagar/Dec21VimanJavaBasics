package variablesinjava;

public class StaticVariable {

	static int d = 90;
	
	
	
	public static void main(String[] args) {
//		access the static variable in same class
		System.out.println(d);
//	access	the static variable from class	
		System.out.println(StaticVariable2.b);
		
		int v = d+2;
		
		
		d =d+2;
		
		System.out.println(d);
		
		
		d=80;
		
		System.out.println(d);
		
		StaticVariable2.b = false;
		
		System.out.println(StaticVariable2.b);
		
		
		d= StaticVariable2.h +2;
		
		System.out.println(d);
		
	}
	
	
}

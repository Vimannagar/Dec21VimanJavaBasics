package polymorphism;

public class OverridingVariableChild extends OverridingVariableParent {
	
	int i = 50;
	
	static int j = 100;
	
	
	public static void main(String[] args) {
		
		OverridingVariableParent p = new OverridingVariableParent();
		System.out.println(p.i);//parent class variable - 10
		
		System.out.println(p.j);//parent class - 20
		
		OverridingVariableChild c = new OverridingVariableChild();
		
		System.out.println(c.i);// child class variable - 50
		System.out.println(c.j);// child class variable - 100
		
		OverridingVariableParent pp = new OverridingVariableChild();
		
		System.out.println(pp.i);// parent class variable - 10
		
		System.out.println(pp.j);//parent class variable - 20
		
		
		
		
		
	}
}

package accessmodifiers;

public class AccessTestInsidePackageVariables {
	
	public static void main(String[] args) {
		
//		accessing public variable inside the class which is in the same package
		System.out.println(VariablesAccessModifiers.i);
		
//		accessing default variable inside the class which is in the same package
		
		System.out.println(VariablesAccessModifiers.s);
		
//		System.out.println(VariablesAccessModifiers.b);- b is private variable hence it is not accessible 
		
		
		VariablesAccessModifiers vam = new VariablesAccessModifiers();
		System.out.println(vam.j);// protected variable
		
		
	}

}

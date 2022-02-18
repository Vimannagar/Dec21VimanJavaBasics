package constructors;

public class B {
	
//	in this class we will see the use of constructor:
	
	String name ;
	String nativeplace;
	int mathsmarks;
	int age;
	
	static int roll;
	
	static String collegecity;
	static String collegename;
	
	public B(String name, String nativeplace, int mathmarks, int age)
	{
		this.name = name;
		this.nativeplace = nativeplace;
		this.mathsmarks= mathmarks;
		this.age= age;
	}
	
	
	
	public static void main(String[] args) {
		
		
		B s1 = new B("Daniel", "Alaska", 50, 18);
		
		B s2 = new B("Eder", "unioncity", 60, 19);
		
		
		System.out.println(s2.age);
		
		
		
	}

	
	

}

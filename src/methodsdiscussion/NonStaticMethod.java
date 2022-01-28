package methodsdiscussion;

public class NonStaticMethod {
	

public static void main(String[] args) {
//	classname variable_name = new Classname();--- Object 
	
	NonStaticMethod varname = new NonStaticMethod();
	NonStaticMethod varname1 = new NonStaticMethod();
	
	varname.methodOne();
	
	varname.methodTwo();
	
	NonStaticMethod obj = new NonStaticMethod();
	
	obj.methodTwo();
	obj.methodOne();
	
	
//	to call non static method from other class
	
	NonStaticMethod2 var2 = new NonStaticMethod2();
	
	var2.m3();
	

	
	
	
	
}
	

//non static method
public void methodOne()
{
	System.out.println("Non static method from Non static method class");
}

//non static method
public void methodTwo()
{
	System.out.println("Non static method two");
	NonStaticMethod2 var3 = new NonStaticMethod2();
	
	var3.m3();
}
	
}

package variablesinjava;

public class ThisKeyword {

	
	int i = 10;
	
	static String s= "abc";
	
	public void m1()
	{
		int i= 5;
		System.out.println(i);//5
		System.out.println(this.i);//10
		System.out.println(this.s);
	}
	
	
public static void m2()
{
	int i = 6;
	
	System.out.println(i);//6
}

public static void main(String[] args) {
	
	ThisKeyword tk = new ThisKeyword();
	tk.m1();
	
}
}

package variablesinjava;

public class Test {
	
	static int i = 10;
	int j = 20;
	
	
	public static void main(String[] args) {
		
		System.out.println(i);//10
		
		Test t = new Test();
		System.out.println(t.j);//20
		
		i=50;
		
		System.out.println(i);//50
		
		t.i = 60;
		
		System.out.println(t.i);//60
		
		Test t1 = new Test();
		
		t1.j= 30;
		
		System.out.println(t1.j);//30
		
		System.out.println(t.j);//20
		
		System.out.println(t1.i);//60
		
		t.j= 45;
		
		t1.j= 80;
		
		t.i=12;
		
		t1.i = 56;
		
		
		
		System.out.println(i);
		
		System.out.println(t.i);//56
		
		System.out.println(t1.i);//56
		
		i=92;
		
		System.out.println(t.i);//92
		
		System.out.println(t1.i);//92
	}

}

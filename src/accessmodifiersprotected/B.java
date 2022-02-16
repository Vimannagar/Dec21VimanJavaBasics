package accessmodifiersprotected;

public class B {
	
	public static  void  main(String[] args) {
		A a = new A();
		
		a.m1();
		a.m2();
		a.m3();
		A.m4();
		
	}
	
	public static  void  main(int[] a) {
		System.out.println("main method int arg");
	}

}

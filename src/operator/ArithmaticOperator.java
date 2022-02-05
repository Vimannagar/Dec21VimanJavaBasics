package operator;

public class ArithmaticOperator {
	
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
//		i. addition operator '+'
	int	c = a+b;
	
	System.out.println(c);//30
	
//	ii. substraction operator '-'
	
	int d = b-a;
	
	System.out.println(d);//10
	
//	iii. multiplication operator '*'
	
	int e = a*b;
	System.out.println(e);//200
	
//	iv. division operator '/'
	
	int f = a/b;
	
	System.out.println(f);//2
	
	int g = b/a;
	
	System.out.println(g);
	
//	v. modulo operator '%'
	
	int j = 10;
	int k = 3;
	
	int l = j%k;
	
	System.out.println(l);
	
	
	
	byte b1 = 10;
	byte c1 = 50;
	
	int d1 = b1 + c1 ;
	
//	byte--> short--> int--> long--> float--> double
//		    char 
	
//	byte + byte = int
//	byte + short = int
//	short + short = int
//	int + long = long
	
//	int + float= float
	
	
	byte v = 50;
	long l1 = 5666l;
	
	
	long g1 = v+ l1;
		
	}

}

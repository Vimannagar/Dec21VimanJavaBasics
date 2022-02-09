package operator;

public class LogicalOperator {
	
	
	public static void main(String[] args) {
//		AND logical operator
		
		int i = 10;
		
		int j = 50;
		
		boolean k = i==10;
		
	boolean	l = j<20;
	
		boolean m = k && l && (j==50);
		
		System.out.println(m);//false
		
//		OR logical operator
		
	boolean	n = k || l;
	
	System.out.println(n);// true
	
//	NOT operator
	
	int q = 12;
	
	boolean p = !(q==10);
	
	System.out.println("p value is "+p);
		
	if(q!=12)
	{
		System.out.println("q is not equal to 12");
	}
	else
	{
		System.out.println("q is equal to 12");
	}
		
		
		
	}

}

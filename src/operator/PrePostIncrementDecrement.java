package operator;

public class PrePostIncrementDecrement {
	
	public static void main(String[] args) {
		int i= 10;
		
		
	int 	j= i++;
	
	System.out.println(j);//10
	System.out.println(i);//11
	
	int k = ++i;
	System.out.println(k);//12
	System.out.println(i);//12
		
	}

}

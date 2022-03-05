package arraydiscussion;

public class Test {
	String s [];
	
	public static void main(String[] args) {
		
		
//		1st way to define the array:
		
		int [] a = new int[10];
		
		a[0] = 1;
		a[1] = 60;
		a[2] = 70;
		a[3] = 98;
		a[4] = 12;
		a[5] = 45;
		a[6] = 80;
		a[7] = 82;
		
		System.out.println(a[3]);
		
		for(int i =0; i<=9; i++)
		{
			System.out.println(a[i]);
		}
		
		
		int size = a.length;
		
		System.out.println(size);
		
		for(int i =0; i<size; i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("***********************************************");
		
//for(Variable which is the type of each value:to whom we wants to iterate)
//	{
//			
// }
		
		for(int w:a)
		{
			System.out.println(w);
			
			if(w==45)
			{
				System.out.println("value is equal to 45 breaking the loop");
				break;
			}
		}
		
		
	}

//	WAP to print the even index element of an array
//	WAP to print the sum of even elements of an array
	
	
	
}

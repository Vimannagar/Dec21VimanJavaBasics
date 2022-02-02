package methodsdiscussion;

public class FarmerAssignment {

	
	
	public int landAreaCalculator(int length, int breadth)
	{
		int area = length * breadth;
		
		return area;
	}
	
	public static void main(String[] args) {
		
		FarmerAssignment fa = new FarmerAssignment();
		
		int area1 = fa.landAreaCalculator(20, 20);
		
		int area2 = fa.landAreaCalculator(10, 15);
		
		int area3 = fa.landAreaCalculator(15, 20);
		
		int sumofarea = area1 +area2 + area3;
		
		System.out.println(sumofarea);
		
	}
}

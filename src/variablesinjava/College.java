package variablesinjava;

public class College {
	
	static String collegename = "COEP";
	
	String name;
	int mathmarks;
	int physicsmarks;
	
	public static void main(String[] args) {
		College s1 = new College();
		s1.name = "Daniel";
		s1.mathmarks = 50;
		s1.physicsmarks= 60;
		
		College s2 = new College();
		s2.name = "Ron";
		s2.mathmarks = 40;
		s2.physicsmarks= 80;
		
		College s3 = new College();
		s3.name = "Eder";
		s3.mathmarks = 90;
		s3.physicsmarks= 20;
		
		System.out.println(s3.name);
		
		System.out.println(s1.mathmarks);
		
		System.out.println(collegename);
		
		
		
	}
	

}

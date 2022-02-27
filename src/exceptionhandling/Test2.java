package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test2 {
	
	int i = 50;
	public static void main(String[] args) throws FileNotFoundException  {
		System.out.println("first line of script");
		
		FileInputStream fis = new FileInputStream("E:\\Desktop\\VimanNagar\\Dec 21\\Architecture of java.docx");
		
		System.out.println("last line of script");
	}

}

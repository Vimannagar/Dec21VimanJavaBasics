package stringclass;

public class MethodsInStringClass {
	
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abcdef";
		
		// 1. equals:
		
		boolean isequal = s1.equals(s2);
		
		System.out.println(isequal);//false
		
		System.out.println("*****************************************");
		
		//2. equalsIgnoreCase()
		String s3 = "abc";
		String s4 = "ABC";
		
		boolean isconequal = s3.equalsIgnoreCase(s4);
		
		System.out.println(isconequal);// true
		
		System.out.println("*******************************************");
		
		//3. charAt(int indexvalue)
		
		String s5= "Velocity";
		
//		char value = s5.charAt(20);// exception - StringIndexOutOfBoundException
		char value = s5.charAt(2);
		System.out.println(value);//l
		
		
		System.out.println("********************************************");
		
//		WAP to print the characters of the string one by one
		
		for(int i=0; i<=7; i++)
		{
			char f = s5.charAt(i);
			System.out.println(f);
		}
		
	System.out.println("****************************************************");	
		
//		4. concat(String s)
		
	s5	= s5.concat(" corporate");
	
	System.out.println(s5);// Velocity corporate
		
	System.out.println("***************************************************");
	
//	5. contains(String s)
	
	String s6 = "efdCba";
	
	boolean ispresent = s6.contains("cba");
	System.out.println(ispresent);//false
	
	System.out.println("***************************************************");
	
//	6. subString(int beginindex)
	
	String s7= "Velocity";
	
	String s8 = s7.substring(4);
	System.out.println(s8);// city
	System.out.println("***************************************************");
//	7. subString(int beginindex, int endindex):
	
	String s9 = "Corporate";
	
	String s10 = s9.substring(3, 7);
	
	System.out.println(s10);// pora
	System.out.println("***************************************************");
//	8. length()
	
	String s11 = "abcdef ghijklm";
	
	int s12 = s11.length();
	System.out.println(s12);//14
	System.out.println("***************************************************");
	
//	9. indexOf(char c)
	
	String s13 = "Velocity";
	
	int s14 = s13.indexOf('o');
	System.out.println(s14);//3
	
	
	System.out.println("***************************************************");
//	WAP to print the char value and its index position inside a string
	
	String s22 = "Velocity";
	
	for(int i=0; i<s22.length(); i++)
	{
		char s23 = s22.charAt(i);
		System.out.println(s23+" "+i);
	}
	
	
	
	
// 10. replace(char oldchar, char newchar):
	
	String s15 = "ab!cef";
	
	String s16 = s15.replace('!', '$');
	
	System.out.println(s16);// ab$cef
	
	System.out.println("***************************************************");	
	
//11. replace(String old, String new)
	
	String s17 = "This is String";
	
	String s18 = s17.replace("String", "character");
	
	System.out.println(s18);//This is character
	
//12. toLowerCase()
	
	String s19 = "ABCdef";
	
	String s20 = s19.toLowerCase();
	System.out.println(s20);//abcdef
	
//	13. toUpperCase()
	
	String s21 = s20.toUpperCase();
	
	System.out.println(s21);//ABCDEF
	
	
//	WAP to reverse a given string
	
//	14. trim()
	
	String s24 = "     val ue     ";
	
	String s25 = s24.trim();
	
	System.out.println(s25);//val ue
	
	
//	15. replace
	String s26 = "This    is   a String";
	
	String s27 = s26.replace(" ", "");
	
	System.out.println(s27);//ThisisaString
	
	
//	16. split
	
	String s28 = "This  is String";
	
	String[] s29 = s28.split(" ");
	
	for(String j:s29)
	{
		System.out.println(j);
	}
	
	for (int i=0; i<s29.length; i++)
	{
		System.out.println(s29[i]);
	}
	
	//17. toCharArray():
	String s30 = "Velocity";
	 
	char[] s31 = s30.toCharArray();
	
	for(char c :s31)
	{
		System.out.println(c);
	}
	
	
//18.	isDigit(char c)
	
char s32 = 'a';
	
boolean	isnumber = Character.isDigit(s32);

System.out.println(isnumber);//false
	
String s33 = "sdjkfhsdkjfk3423nsdjhf324ffjhf";	
//	WAP to remove the numbers from a string
	
System.out.println("***********************************************");


//19. isAlphabetic

char s34 = 'A';

boolean isalpha = Character.isAlphabetic(s34);

System.out.println(isalpha);// true


// to convert primitive to String

int s35 = 10;

System.out.println(s35+2);//12

String stringvalue = String.valueOf(s35);
	
System.out.println(stringvalue+2);//102
boolean s36 = false;

String booleanstring = String.valueOf(s36);

System.out.println(booleanstring);

//String to primitive data type

String s37 = "50";

//String to int conversion

int intvalue = Integer.parseInt(s37);

System.out.println(intvalue+2);//52

String s38 = "56.25";

double doublevalue = Double.parseDouble(s38);

System.out.println(doublevalue);//56.25

String s39 = "true";

boolean booleanvalue = Boolean.parseBoolean(s39);

if(booleanvalue)
{
	System.out.println("boolean value is true");
}

System.out.println("*************************************************");

String s40 = "#c2342^&^%a$pge452mini";

String s41 = s40.replaceAll("[a-z]", "0");
System.out.println(s41);//#02342^&^%0$0004520000


System.out.println("**************************************");

String s42 = s40.replaceAll("[^a-z]", "0");
System.out.println(s42);//0c00000000a0pge000mini
System.out.println("**************************************");
String s43= s40.replaceAll("[a-zA-Z]", "?");

System.out.println(s43);//#?2342^&^%?$???452????

//String s44 = s40.replaceAll("[0-9]", "$");
//
//System.out.println(s44);
String s44 = s40.replaceAll("[a-e]", "?");

System.out.println(s44);

System.out.println("*****************************************");

String s45= s40.replaceAll("[^a-z]", "");

System.out.println(s45);//capgemini
System.out.println("*****************************************");
String s46 = s40.replaceAll("[0-9]", "!");
System.out.println(s46);//#c!!!!^&^%a$pge!!!mini




	
	}
	
	

}

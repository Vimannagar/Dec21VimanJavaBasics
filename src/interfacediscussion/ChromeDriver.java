package interfacediscussion;

public class ChromeDriver implements Interface1 {

int i =50;

	public void close() {
		System.out.println("close the browser");
		
	}


	public void open() {
		System.out.println("open the browser");
		
	}

	
	public void click() {
		
		System.out.println("click on the button");
	}

	
	public void getId() {
		
		System.out.println("get the value from field");
	}
	
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.open();
		driver.click();
		driver.getId();
		driver.close();
		
		Interface1 i1 = new ChromeDriver();
		
		i1.click();
		
		i1.open();
	}
	

}

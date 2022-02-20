package encapsulation;

public class BankServer {
	
private	int cust1balance = 50000;
	
	
	public void getBalance(int pin)
	{
		if(pin == 1234)
		{
			System.out.println("Your account balance is :"+cust1balance);
		}
		else
		{
			System.out.println("please check the pin and try again");
		}
		
	}
	
	public void withdrawl(int amount)
	{
		setBalance(amount);
	}
	
	public void setBalance(int amount)
	{
		if(amount<=cust1balance)
		{
			cust1balance= cust1balance - amount ;
			System.out.println("Amount :"+amount+ " withdrawl and your balance is "+cust1balance);
		}
		else
		{
			System.out.println("No sufficient balance");
		}
		
	}
	

}

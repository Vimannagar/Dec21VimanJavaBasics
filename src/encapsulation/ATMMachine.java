package encapsulation;

public class ATMMachine {
	
	
	public static void balanceEnq(int pin)
	{
		BankServer bs = new BankServer();
		bs.getBalance(pin);
		
	}
	
	public static void main(String[] args) {
		balanceEnq(1234);//50000
		
		BankServer bs = new BankServer();
		
		bs.withdrawl(5000);
		
	}

}

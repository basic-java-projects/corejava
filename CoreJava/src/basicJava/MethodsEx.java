package basicJava;
public class MethodsEx {

	static int currentBalance=1000;
	static int amount;
	
	public static void greeting() {
		System.out.println("Hello ,welcome");
	}
	public  int deposit(int amount) {
		currentBalance=currentBalance+amount;
		System.out.println("amount is deposited successfully");
		return currentBalance;
	}
	public static void withdrawal(int amount) {
		if(currentBalance>amount)
		{
			currentBalance=currentBalance-amount;

			System.out.println("amount is withdrawn successfully");
		}
	}
	public  int getBalance()
	{
		return currentBalance;
	}
	
	public static void main(String[] args) {
		MethodsEx bank=new MethodsEx();
		greeting();
		System.out.println("Current Balance "+currentBalance);
		bank.deposit(500);
		System.out.println("Current Balance "+currentBalance);
		withdrawal(200);
		System.out.println("Current Balance "+currentBalance);
		

	}

}

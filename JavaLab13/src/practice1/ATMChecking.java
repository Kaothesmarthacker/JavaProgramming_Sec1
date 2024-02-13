package practice1;

public class ATMChecking extends ATMData{
	private int money;
	public ATMChecking(String accountNumber,String password,int money) {
		super(accountNumber,password);
		this.money = money;
	}
	public boolean checkBookBank() {
		
		return false;
	}
	public void show() {
		
	}
}

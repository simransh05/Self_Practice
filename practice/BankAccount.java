package practice;
public class BankAccount {
	private int accountNUM;
	private String accountHolderName;
	private double balance;
    
	public void depositMoney (double money) {
		if (money <=0) {
			System.out.println("error , invalid amount");
		}
		balance +=money;
	}
	public double withDraw (double money) {
		if (balance<money) {
			System.out.println("not enough money");
		}
		balance -=money;
		return money;
	}
	public BankAccount(int accountNUM, String accountHolderName) {
		this.accountNUM = accountNUM;
		this.accountHolderName = accountHolderName;
	}
	
}
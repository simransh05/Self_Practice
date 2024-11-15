package practice;
public class customer{
	public static void main(String [] args) {
		BankAccount bank = new BankAccount(123 , "simran");
		bank.depositMoney(100);
		System.out.println(bank.withDraw(50));
//		System.out.println(BankAccount.balance)
	}
}
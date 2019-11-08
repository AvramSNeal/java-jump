package assertions;

public class Account {
	private double balance;
	public double getBalance() {
		return balance;
	}
	public void setBalance(double amount) {
		this.balance = amount;
	}
	public double deposit(double amount) {
		double oldBalance = balance;
		balance += amount;
		//more processing...
		assert balance > oldBalance;
		return balance;
	}
	public double withdraw(double amount) {
		double oldBalance = balance;
		balance -= amount;
		//more processing...
		assert balance < oldBalance;
		// assert balance > oldBalance; // This will cause the assert to assert false
		//assert false
		return balance;
	}
	public static void main(String[] args) {
		Account account = new Account();
		account.deposit(50.0);
		account.withdraw(100.0);
		account.deposit(150.5);
		System.out.println("The account balance is $" + account.getBalance());
	}
}

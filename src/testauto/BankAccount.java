package testauto;

public class BankAccount {

	String accountNumber;
	double balance;
	String owner;

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public double deposit(double extramoney)

	{
		balance = balance + extramoney;
		return balance;
	}

	public double withdraw(double extramoney) {
		balance = balance - extramoney;
		return balance;
	}
	
	public void printStatement( )
	{
		System.out.println(this.accountNumber+" "+this.balance+" "+this.owner );
	}
}

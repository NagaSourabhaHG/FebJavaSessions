package javaconcepts;

public class BankAccount {
	
	String accountNumber;
	double balance;
	
	public BankAccount(String accountNumber,double balance){
		this.accountNumber=accountNumber;
		this.balance=balance;
		
	}
		
		public double testAddDeposit (double deposit)
		{
			double newBalance=deposit+balance;
			System.out.println(newBalance);
			return newBalance;
		}
		
		public double testWithdrawDeposit( double withdraw )
		{
			double newBalance=balance-withdraw;
			System.out.println(newBalance);
			return newBalance;
		}
		
		public static void main(String[] args)
		{
		BankAccount test=new BankAccount("12345",23455.77);
		System.out.println(test.accountNumber);
		System.out.println(test.balance);
		test.testAddDeposit(2455);
		test.testWithdrawDeposit(244);
		test.testAddDeposit(899);
		test.testWithdrawDeposit(50);
		
		
		
		}
	}



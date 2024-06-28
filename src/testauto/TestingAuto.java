package testauto;

public class TestingAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		BankAccount test=new BankAccount();
		test.setAccountNumber("1234");
		test.setBalance(12344.55);
		test.setOwner("Sanvi");
		test.deposit(2000);
		test.withdraw(1000);
		test.printStatement();

	}

}

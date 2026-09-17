package encapsulation.questions;

public class Main {

	public static void main(String[] args) {

		BankAccount bank=new BankAccount ();
		
		bank.setAccountNumber(12345);
		bank.setAccountHolder("Shimna");
		bank.setAccountBalance(5000);
		
		bank.deposit(2000);
		//bank.withdraw(1000);
		
		bank.displayDetails();

	}

}

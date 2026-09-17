package encapsulation.example;

public class BankAccountDemo {
	
private double balance;
	
	public  void setBalance(double balance) {
		if(balance>=0) {
			this.balance=balance;
		}
		
		
	}
	public  double getBalance() {
			return balance;
			
		}

}

package encapsulationquestion;

public class BankAccount {
	
	private double accountNumber;
	private String accountHolderName;
	private double accountBalance;
	
	
	 public void setAccountNumber(double accountNumber) { 
		 this.accountNumber=accountNumber;		 
	 }
	public  double getAccountNumber() {
			return accountNumber;
				
			}
	 public void setAccountHolder(String accountHolderName) {
		 this.accountHolderName=accountHolderName;
	 }
	 public  double getAccountHolder() {
			return accountNumber;
				
			}
	 public void setAccountBalance(double accountBalance) {
		 this.accountBalance= accountBalance;
	 }
	 
	 public  double getAccountBalance() {
			return accountNumber;
				
			}
	 public void deposit(double amount) {
		 if(amount>0) {
			 accountBalance=accountBalance+amount;
			 
		 }
		 else {
			 System.out.println("Invalid deposit amount");
		 }
	 }
	 
	 
	 
	 public void withdraw(double amount) {
		 if(amount<=0) {
			 System.out.println("Invalid ");
		 }
		 else if(amount>accountBalance) {
			 System.out.println("Insufficient balance");
		 }
		 else {
			 accountBalance=accountBalance-amount;
		 }
	 }
	 
	 public void displayDetails() {
		 System.out.println("Account Number="+accountNumber);
		 System.out.println("Account Holder Name="+accountHolderName);
		 System.out.println("Account Balance="+accountBalance);
	 }
	
	 
		
	

}

package assignment.encapsulation;

public class User {

	public static void main(String[] args) {
		
		 int pin = 1234;

	        Bank bank = new Bank();
	        
	        bank.setPin(pin);
	        bank.pinValidate();

	}

}

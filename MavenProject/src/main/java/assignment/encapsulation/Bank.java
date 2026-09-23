package assignment.encapsulation;

public class Bank {
	
	private int pin;
	
	
	public void setPin(int pin) {
		
		this.pin=pin;
	}

	public void pinValidate() {
		
		if (pin == 1001 || pin == 1234 || pin == 1212) {
			
			System.out.println("Pin Validated");
			System.out.println("Withdrawl Successful");
		}
		else {

            System.out.println("Invalid PIN");
        }
	}
}

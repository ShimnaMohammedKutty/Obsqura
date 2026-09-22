package interfacepgm;

public class Main {

	public static void main(String[] args) {

    CreditCard cc=new CreditCard();
    cc.pay();
    
    System.out.println();
    
    UPI upi=new UPI();
    upi.pay();

	}

}

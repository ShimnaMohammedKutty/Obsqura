package encapsulation;

public class MainDemo {

	public static void main(String[] args) {

     BankAccountDemo ba=new BankAccountDemo();
     ba.setBalance(12345);
     System.out.println(ba.getBalance());

	}

}

package assignment.polymorphism;

public class Main {

	public static void main(String[] args) {
		
		Customer customer=new Onseason();
		
		customer.discount();
		
		Customer customer1=new Offseason();
		
		customer1.discount();
		
		

	}

}

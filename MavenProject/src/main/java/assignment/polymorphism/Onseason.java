package assignment.polymorphism;

public class Onseason extends Customer{
	
	public void discount() {
		
		double discount=clothPrice*40/100;
		double finalClothPrice=clothPrice-discount;
		
		 System.out.println("Onseason Discount : " + discount);
	        System.out.println("Final Cloth Price : " + finalClothPrice);
	}
	
	

}

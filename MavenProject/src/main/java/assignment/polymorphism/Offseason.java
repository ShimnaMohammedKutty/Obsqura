package assignment.polymorphism;

public class Offseason extends Customer{
	
public void discount() {
		
		double discount=clothPrice*15/100;
		double finalClothPrice=clothPrice-discount;
		
		 System.out.println("Offseason Discount : " + discount);
	        System.out.println("Final Cloth Price : " + finalClothPrice);
	}

}

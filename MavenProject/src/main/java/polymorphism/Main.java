package polymorphism;

public class Main {

	public static void main(String[] args) {

      /*Dispaly only animal class method
		
		Animal a=new Animal();
       a.sound();*/
		
		//For all class method calling need Upcasting
		
		Animal a=new Animal();
		a.sound();
		Animal a1=new Dog();
		a1.sound();
		Animal a2=new Cat();
		a2.sound();

	}

}

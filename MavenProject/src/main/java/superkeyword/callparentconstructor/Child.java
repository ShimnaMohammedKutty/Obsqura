package superkeyword.callparentconstructor;

public class Child extends Parent{
	
	/*Child(){
		
		super();
		System.out.println("Child class constructor");
	}*/
	
	//Parameterized
	
	Child(String msg){
		
		super(msg);
		System.out.println("Child class constructor with parameterized");
		
	}

}

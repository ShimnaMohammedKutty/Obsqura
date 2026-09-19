package finalkeyword;

public class Variable {
	
	final int rollno=123;
	String name="Anu";
	
	public void display() {
		
		System.out.println("Roll number="+rollno);
		System.out.println("Name="+name);
		
	}

	public static void main(String[] args) {

		Variable va=new Variable();
		va.display();
		/*va.rollno=135;  Error will dispalyed bcz the rollno is using final keyword 
		                  so it is constant once its declared we cannot change the value*/

	}

}

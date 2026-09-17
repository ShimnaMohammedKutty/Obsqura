package accessmodifiers;

public class ModifiersPublic {
	
	protected int num=123;
	
     protected void print() {
    	 System.out.println("Public access  modifiers");
    	 System.out.println(num);
     }

	public static void main(String[] args) {
		
		ModifiersPublic pub=new ModifiersPublic();
		pub.print();
		System.out.println(pub.num);

	}

}

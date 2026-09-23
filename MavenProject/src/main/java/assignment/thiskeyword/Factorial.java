package assignment.thiskeyword;

public class Factorial {
	
	int num;
	int fact=1;
	
	public void factOfNumber(int num) {
		
		this.num=num;
		
		
		for(int i=1;i<=num;i++) {
			
			fact=fact*i;
		}
		
		this.result();
	}
		
	public void result() {
		
		System.out.println("Factorial of a number="+fact);
	}
	
	

	public static void main(String[] args) {

		Factorial f=new Factorial();
		f.factOfNumber(5);
  
	}

}

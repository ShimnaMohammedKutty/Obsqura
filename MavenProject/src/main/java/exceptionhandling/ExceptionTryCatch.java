package exceptionhandling;

public class ExceptionTryCatch {

	public static void main(String[] args) {

		int num1=20;
		int num2=0;
		
		//int num2=5;  if no pblm or exception result will be printed 
		
		System.out.println("Prgm started");
		
		try {
			
			int result=num1/num2;
			System.out.println("Result is : "+result);
		}
		catch(ArithmeticException ae) {
			
			//ae.printStackTrace();
			
			System.out.println(ae.getMessage());
				
		}
		
		System.out.println("Rest of pgm");

	}

}

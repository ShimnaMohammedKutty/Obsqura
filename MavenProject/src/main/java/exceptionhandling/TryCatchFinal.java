package exceptionhandling;

public class TryCatchFinal {

	public static void main(String[] args) {
		
		int num1=10;
		int num2=0;
		
		System.out.println("Before Exception Executed");
		
		try {
			int result=num1/num2;
			System.out.println("Result is : \"+result");
			
		}catch(ArithmeticException ae) {
			
			//ae.printStackTrace();
			
			System.out.println(ae.getMessage());
				
		}finally {
			
			
			System.out.println("Finally  Executed");
		}
		System.out.println("After Exception Executed");
		

	}

}

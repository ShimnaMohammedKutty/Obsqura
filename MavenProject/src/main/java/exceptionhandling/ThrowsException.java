package exceptionhandling;

public class ThrowsException {
	
	                          // this is the difference from throw & throws
public void checkAge(int age) throws ArithmeticException,ArrayIndexOutOfBoundsException {
		
		if(age<18) {
			
			throw new ArithmeticException("Person is not Eligible to Vote");
		}
		
		System.out.println("Person is Eligible to vote");
	}
		
	public static void main(String[] args) {

		/*ThrowException thr=new ThrowException();
		thr.checkAge(15);
		System.out.println("Rest of code");*/
		
		//if we want to execute rest of the code which is not related to method
		
		ThrowException thr=new ThrowException();
		try {
			
			thr.checkAge(15);
		}catch(ArithmeticException ae) {
			
			ae.printStackTrace();
		}
		
		System.out.println("Rest of code");

	}



}

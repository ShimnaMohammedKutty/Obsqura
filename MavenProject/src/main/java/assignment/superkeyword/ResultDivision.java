package assignment.superkeyword;

public class ResultDivision extends Addition {
	
	public void checkResult() {
		
		int result=super.addition(num1, num2);
		
		 if (result % 10 == 0) {

	            System.out.println("Addition result is divisible by 10");

	        } else {

	            System.out.println("Addition result is not divisible by 10");
	        }
		
	}

}

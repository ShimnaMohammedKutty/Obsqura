package exceptionhandling.customexception;

public class Mark {
	
	public void checkMark(int mark) {
		
		if(mark<0) {
			
			   throw new InvalidException("Invalid mark Plese check the mark");
        }

        System.out.println("Valid mark");
		}
	

	public static void main(String[] args) {
		
		Mark m=new Mark();
		try {
			
			m.checkMark(-10);
			
		}catch(InvalidException in) {
			
			 in.printStackTrace();
		}
		
		System.out.println("Rest of code");
		
	}

}

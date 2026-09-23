package assignment.thiskeyword;

public class Reverse {
	
	int num;              //store the number
	int reverse=0;        //store the reverse number
	
	Reverse(int num){     //constructor
		
		this();           //Calling the second constructor with no arguments 
		
		this.num=num;
		
		while(num!=0) {
			
			int digit=num%10;
			reverse=reverse*10+digit;
			num=num/10;
			
		}
	}

	Reverse(){                           //constructor
		
		System.out.println("Finding reverse");
	}
	
	public static void main(String[] args) {

		Reverse rev=new Reverse(12345);
		int rev1=rev.reverse;
		System.out.println("Reverse="+rev1);

	}

}

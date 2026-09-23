package assignment;

public class StringPalindrome {

	public static void main(String[] args) {

    String str="malayalam";
    StringBuilder sb=new StringBuilder(str);
    sb.reverse();
    if(str.equals(sb.toString())) {
    	 System.out.println(str + " is Palindrome");
    }
    else {
    	System.out.println(str + " is Not Palindrome");
	   }
    
    String str1="java";
    StringBuilder sb1=new StringBuilder(str);
    sb.reverse();
    if(str1.equals(sb1.toString())) {
    	System.out.println(str1 + " is Palindrome");
    }
    else {
    	System.out.println(str1 + " is Not Palindrome");
	   }
	}

}

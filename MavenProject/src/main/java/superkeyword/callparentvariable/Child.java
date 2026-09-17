package superkeyword.callparentvariable;

public class Child extends Parent{
	
	int num=30;
    public void display() {
    	
    	System.out.println(num);            //child class variable
    	System.out.println(super.num);      //parent class variable call using super keyword
    	 
     }


}

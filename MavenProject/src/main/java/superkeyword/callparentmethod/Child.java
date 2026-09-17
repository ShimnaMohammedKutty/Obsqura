package superkeyword.callparentmethod;

public class Child extends Parent{
	
	public void show()
	{
		System.out.println("Child Method");
	}
	public void display() {
		show();
		super.show();
	}
}

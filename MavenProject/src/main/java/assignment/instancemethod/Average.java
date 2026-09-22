package assignment.instancemethod;

public class Average {
	
	float total;
	float avrg;
	
	public void averageInteger(int num1,int num2,int num3) {
		
		total=num1+num2+num3;
		avrg=total/3;
		
		System.out.println("Average of 3 integer number="+avrg);
		
	}

	public void averageFloat(float num1f,float num2f,float num3f) {
		
		total=num1f+num2f+num3f;
		avrg=total/3;
		
		System.out.println("Aversge of three float number="+avrg);
		
	}
	public static void main(String[] args) {

      Average av=new Average();
      av.averageInteger(10, 15, 20);
      av.averageFloat(12.5f, 15.3f, 30.0f);
      

	}

}

package assignment.instancemethod;

public class Area {
	
	double result;
	
	//Area of circle
	public void Area(float radius) {
		
		result=3.14*radius*radius;
		System.out.println("Area of circle = " + result);
		
	}
	
	//Area of rectangle
	public void Area(int length,int breadth) {
		
		result=length*breadth;
		System.out.println("Area of rectangle = " + result);
	}

	//Area of square
	public void Area(int side) {
		
		result=side*side;
		System.out.println("Area of square = " + result);
	}
	
	public static void main(String[] args) {

     Area area=new Area();
     
     area.Area(5);
     area.Area(2, 3);
     area.Area(4);

	}

}

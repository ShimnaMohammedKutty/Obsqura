package assignment.inheritance;

public class Salary extends Employee{
	
	double hra;
	double pf;
	
	public void calculateSalary() {
		
		 hra = basicPay * 5 / 100;
	     pf = basicPay * 20 / 100;
	}

}

package assignment.inheritance;

public class Total extends Salary {
	
	double totalSalary;
	
	public void salarySlip() {
		
		totalSalary = basicPay + hra - pf - deduction + bonus;
		
		    System.out.println("--------- SALARY SLIP ---------");
	        System.out.println("Basic Pay    : " + basicPay);
	        System.out.println("HRA          : " + hra);
	        System.out.println("PF           : " + pf);
	        System.out.println("Deduction    : " + deduction);
	        System.out.println("Bonus        : " + bonus);
	        System.out.println("Total Salary : " + totalSalary);
	}

	public static void main(String[] args) {

		Total total=new Total();
		total.calculateSalary();
		total.salarySlip();

	}

}

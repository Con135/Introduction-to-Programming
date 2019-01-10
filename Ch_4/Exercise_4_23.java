//Connor Cecil
//1-9-2018
//A program that reads the information nd prints a payroll.

import java.util.Scanner;

class Exercise_4_23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter employee's name: ");
		String name = input.nextLine();
		
		System.out.print("Enter number of hours worked: ");
		int hoursWorked = input.nextInt();
		
		System.out.print("Enter hourly pat rate: ");
		double hourlyPayRate = input.nextDouble();
				
		System.out.print("Enter federal tax withholding rate: ");
		double taxFederal = input.nextDouble();
				
		System.out.print("Enter state tax withholding rate: ");
		double taxState = input.nextDouble();
		
		System.out.println("Employee Name: " + name);
		
		System.out.println("Hours worked: " + hoursWorked);
		
		System.out.printf("Pay rate: $%.2f\n" , hourlyPayRate);
		
		System.out.printf("Gross pay: $%.2f\n" , (hoursWorked * hourlyPayRate));
		double grossPay = (hoursWorked * hourlyPayRate);
		
		System.out.println("Deductions: ");
		
		System.out.printf("Federal Withholding (" + taxFederal + "): " + "$%.2f\n" , (taxFederal * grossPay)); 
		double withholdingFederal = (taxFederal * grossPay);
				
		System.out.printf("State Withholding (" + taxState + "): " + "$%.2f\n" , (taxState * grossPay));
		double withholdingState = (taxState * grossPay);		
		
		double netPay = (grossPay -	(withholdingFederal + withholdingState));
		System.out.printf("Net Pay: $%.2f\n" , netPay);
		}
}
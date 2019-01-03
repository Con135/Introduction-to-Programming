//Connor Cecil
//1-2-2018
//Solves linear equations using Crammer's rule.

import java.util.Scanner;

class Exercise_3_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a value for A: ");
		double valueA = input.nextDouble();
		
		System.out.print("Enter a value for B: ");
		double valueB = input.nextDouble();
		
		
		System.out.print("Enter a value for C: ");
		double valueC = input.nextDouble();	
		
			
		System.out.print("Enter a value for D: ");
		double valueD = input.nextDouble();		
		
		
		System.out.print("Enter a value for E: ");
		double valueE = input.nextDouble();	
		
		System.out.print("Enter a value for F: ");
		double valueF = input.nextDouble();
		
		double divideSolution = ((valueA * valueD) - (valueB * valueC));	
		
		double solutionX = (((valueE * valueD) - (valueB * valueF)) / ((valueA * valueD) - (valueB * valueC)));
		
		double solutionY = (((valueA * valueF) - (valueE * valueC)) / ((valueA * valueD) - (valueB * valueC)));
				
		if (divideSolution == 0) { 
			System.out.print("The equation has no solution.");
		}
		else { 
			System.out.print("X = " + solutionX);
			System.out.print(" Y = " + solutionY);		
		}
	}
}